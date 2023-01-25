package rye.array;

import java.util.LinkedList;

/**
 * @author: Rye Whiskey
 * @description: 剑指 Offer 09. 用两个栈实现队列
 * @create: 2023-01-21 23:07
 */
public class Sword09 {

    LinkedList<Integer> inList, outList;

    public Sword09() {
        inList = new LinkedList<>();
        outList = new LinkedList<>();
    }

    public void appendTail(int value) {
        inList.addLast(value);
    }

    public int deleteHead() {
        if(!outList.isEmpty()) {
            return outList.removeLast();
        }
        if(inList.isEmpty()) {
            return -1;
        }
        while(!inList.isEmpty()) {
            outList.addLast(inList.removeLast());
        }
        return outList.removeLast();
    }
}