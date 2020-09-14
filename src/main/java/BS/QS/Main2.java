package BS.QS;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by lenovo on 20/9/12.
 */
class TreeNode {
    String val;
    TreeNode left;
    TreeNode right;

    TreeNode(String a) {
        val = a;
    }

}

public class Main2 {
    static HashMap<String, Integer> map = new HashMap<>();
    static String[] post;
//bdac dbca
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inandpost = scanner.nextLine();
        String sin = inandpost.split(" ")[0];
        String spost = inandpost.split(" ")[1];
        String ina[] = new String[sin.length()];
        String posta[] = new String[sin.length()];
        for (int i = 0; i < sin.length(); i++) {
            ina[i] = sin.charAt(i) + "";
            posta[i] = spost.charAt(i) + "";

        }
        TreeNode root = buid(ina, posta);
        pre(root);
    }

    static void pre(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val);
        pre(root.left);
        pre(root.right);
    }

    public static TreeNode buid(String[] in, String[] po) {
        for (int i = 0; i < in.length; i++) map.put(in[i], i);
        post = po;
        TreeNode root = buid(0, in.length - 1, 0, po.length - 1);
        return root;
    }

    public static TreeNode buid(int inst, int ined, int postst, int posted) {
        if (ined < inst || posted < postst) return null;

        String root = post[posted];
        int rt = map.get(root);

        TreeNode node = new TreeNode(root);
        node.left = buid(inst, rt - 1, postst, postst + rt - inst - 1);
        node.right = buid(rt + 1, ined, postst + rt - inst, posted - 1);
        return node;
    }
}
