package rye.array;

/**
 * @author: Rye Whiskey
 * @description: 剑指 Offer 05. 替换空格
 * @create: 2023-01-21 15:27
 */
public class Sword05 {

    public String replaceSpace(String s) {

        StringBuilder res = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ' ') {
                res.append("%20");
            }else {
                res.append(chars[i]);
            }
        }
        return res.toString();
    }
}