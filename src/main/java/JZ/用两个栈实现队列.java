package JZ;

import java.util.Stack;

/**
 * Created by lenovo on 20/7/19.
 */
public class 用两个栈实现队列 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.add(node);
    }

    public int pop() {
        int temp = 0;
        // 将stack1中的元素移动到stack2
        while (stack1.size() != 0) {
            stack2.add(stack1.pop());
        }
        if (stack2.size() != 0) {
            temp = stack2.pop();
        }

        // 将stack2中的元素移动到stack1
        while (stack2.size() != 0) {
            stack1.add(stack2.pop());
        }

        return temp;
    }
}
