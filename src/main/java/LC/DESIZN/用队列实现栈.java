package LC.DESIZN;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lenovo on 20/8/1.
 */
public class 用队列实现栈 {

}

class MyStack {
    public Queue<Integer> queue = new LinkedList<>();
    public Queue<Integer> tmp = new LinkedList<>();

    /**
     * Initialize your data structure here.
     */
    public MyStack() {

    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        //所有元素转入到临时队列
        int res = -1;
        while (!queue.isEmpty()) {
            res = queue.poll();
            if (queue.size() != 0) {
                tmp.add(res);
            }
        }

        while (!tmp.isEmpty()) {
            queue.add(tmp.poll());
        }
        return res;
    }

    /**
     * Get the top element.
     */
    public int top() {
        int res = -1;
        while (!queue.isEmpty()) {
            res = queue.poll();
            tmp.add(res);
        }

        while (!tmp.isEmpty()) {
            queue.add(tmp.poll());
        }
        return res;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return  queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */