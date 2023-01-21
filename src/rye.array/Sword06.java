package rye.array;


import java.util.ArrayList;
import java.util.List;

/**
 * @author: Rye Whiskey
 * @description: 剑指 Offer 06. 从尾到头打印链表
 * @create: 2023-01-21 20:54
 */
public class Sword06 {

    List<Integer> tmp = new ArrayList<>();

    private void makeAns(ListNode node) {
        if(node == null) {
            return;
        }
        this.makeAns(node.next);
        tmp.add(node.val);
    }

    public int[] reversePrint(ListNode head) {

        this.makeAns(head);
        int[] res = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }
}


