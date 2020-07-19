package JZ;

/**
 * Created by lenovo on 20/7/19.
 */
public class 斐波那契数列 {

    public static void main(String[] args) {
        System.out.println(Fibonacci(15));
    }

    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
