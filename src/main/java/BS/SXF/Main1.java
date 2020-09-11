package BS.SXF;

import javax.lang.model.element.VariableElement;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by lenovo on 20/9/11.
 */
public class Main1 {
    static int s = 0, w = 0, r = 0, res = 0;
    ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        for (int ii = 0; ii < n; ii++) {
            String str = scanner.nextLine();
            Stack<String> stack = new Stack<>();
            res = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 's') {
                    if (stack.size() > 0 && stack.peek() == "r") {
                        process(stack);
                        stack.push("s");
                    }else {
                        stack.push("s");
                    }
                } else if (str.charAt(i) == 'w' && stack.size() != 0) {
                    if (stack.peek() == "r") {
                        process(stack);
                    } else {
                        stack.push("w");
                    }
                } else if (str.charAt(i) == 'r' && stack.size() != 0) {
                    stack.push("r");
                }
            }
            process(stack);
            System.out.println(res);

        }


    }

    public static void process(Stack stack) {
        while (!stack.isEmpty()) {
            if (stack.peek() == "s") {
                s++;
                stack.pop();
            } else if (stack.peek() == "w") {
                w++;
                stack.pop();
            } else {
                r++;
                stack.pop();
            }
        }
        res += s * w * r;
        s = 0;
        r = 0;
        w = 0;
    }
}
