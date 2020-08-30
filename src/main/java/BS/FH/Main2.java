package BS.FH;

import java.util.Scanner;

/**
 * Created by lenovo on 20/8/29.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

        }
        int[] father = new int[n - 1];
        TreeNode root = new TreeNode(arr[0]);
        TreeNode old = null;
        for (int i = 1; i < n; i++) {
            TreeNode tmp = root;
            while (tmp != null) {
                while (tmp != null && arr[i] > tmp.val) {
                    old = tmp;
                    tmp = tmp.right;
                    if (tmp == null) {
                        old.right = new TreeNode(arr[i]);
                        father[i - 1] = old.val;
                        break;
                    }
                }
                while (tmp != null && arr[i] < tmp.val) {
                    old = tmp;
                    tmp = tmp.left;
                    if (tmp == null) {
                        old.left = new TreeNode(arr[i]);
                        father[i - 1] = old.val;
                        break;
                    }
                }

            }

        }
        for (int i = 0; i < father.length; i++) {
            System.out.println(father[i] + " ");
        }
    }
}