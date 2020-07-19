package JZ;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by lenovo on 20/7/18.
 */
public class 重建二叉树 {
    /**
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
     */
    //递归
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
//        Vector<Integer> pre = new Vector<>();
//        Vector<Integer> vin = new Vector<>();
        int pre[] = {1, 2, 4, 7, 3, 5, 6, 8};
        int in[] = {4, 7, 2, 1, 5, 3, 8, 6};
//        for(int i=0;i<pre.size();i++){
//            pre.add(pre1[i]);
//            vin.add(in[i]);
//        }
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        //头节点
        TreeNode head = new TreeNode(1);
        int temproot;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> used = new ArrayList<>();
        for (int i = 0; i < pre.length; i++) {
            temproot = pre[i];
            if (left.contains(temproot)) {
                TreeNode leftchild = new TreeNode(temproot);
                head.left = leftchild;
                left.remove(temproot);
            }
            if (right.contains(temproot)) {
                TreeNode rightchild = new TreeNode(temproot);
                head.right = rightchild;
                right.remove(temproot);
            }
            //分出左右子树
            for (int j = 0; j < in.length; j++) {
                if (j < find(in, temproot) && !left.contains(in[j]) && !used.contains(temproot)) {
                    left.add(in[j]);
                }
                if (j > find(in, temproot) && !right.contains(in[j]) && !used.contains(temproot)) {
                    right.add(in[j]);
                }
            }
            //当前节点作为根
            head.val = temproot;
            used.add(temproot);

        }

        return head;
    }

    public static int find(int arr[], int j) {
        int i = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] != j) {
                i++;
            } else {
                return i;
            }
        }
        return i;
    }
}
