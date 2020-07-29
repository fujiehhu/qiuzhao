package LC.BFS;

import JZ.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by fujie on 20/7/29.
 */
public class 二叉树的右视图 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);
        TreeNode r4 = new TreeNode(4);
        TreeNode r5 = new TreeNode(5);

        root.left = r2;
        root.right = r3;
        r2.right = r5;
        r3.right = r4;
        //rightSideView(root);
        System.out.println(1 + "" + (3 + 1));
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        res.add(root.val);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            //遍历该层节点
            //list 一般用作记录结果
            for (int i = 0; i < size; i++) {
                TreeNode tmp = queue.poll();
                if (tmp.left != null) {
                    list.add(tmp.left.val);
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    list.add(tmp.right.val);
                    queue.add(tmp.right);
                }
            }
            if (!list.isEmpty())
                res.add(list.get(list.size() - 1));
        }
        System.out.println(res);
        return res;
    }
}
