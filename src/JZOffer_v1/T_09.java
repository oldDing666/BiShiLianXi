package JZOffer_v1;

import java.util.Stack;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/9/15 10:22 上午
 */
public class T_09 {

}

class CQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public CQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        if (!s2.isEmpty()) {
            return s2.pop();
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.isEmpty() ? -1 : s2.pop();
    }
}