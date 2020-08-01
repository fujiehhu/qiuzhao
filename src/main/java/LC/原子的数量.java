package LC;

import utils.utils;

import java.util.Stack;

/**
 * Created by fujei on 20/8/1.
 */
public class 原子的数量 {
    //    输入:
//    formula = "H2O"
//    输出: "H2O"
//    解释:
//    原子的数量是 {'H': 2, 'O': 1}。
    public static void main(String[] args) {
        String formula = "K4(ON(SO3)2)2";
        countOfAtoms(formula);
    }

    public static String countOfAtoms(String formula) {

        Stack<String> stack = new Stack<>();
        String tmp;
        for (int i = 0; i < formula.length(); i++) {
            if (formula.charAt(i) >= 'A' && formula.charAt(i) <= 'Z') {

            }
            if (formula.charAt(i) >= '1' && formula.charAt(i) <= '9') {

            }
            if (formula.charAt(i) == '(') {

            }
        }
        return null;
    }
}
