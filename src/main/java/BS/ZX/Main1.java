package BS.ZX;

import java.util.Scanner;

/**
 * Created by fujie on 20/8/31.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int arr[] = new int[n + n];
        int nums[] = new int[n + n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            arr[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
            arr[n + i] = b[i];
        }
        System.out.println(mergesort(arr, 0, n + n - 1, nums));
    }


    public static void merge(int a[], int s, int mid, int e, int tmp[]) {
        int p1 = s, p2 = mid + 1, p3 = 0;
        while (p1 <= mid && p2 <= e) {
            if (a[p1] >= a[p2]) {
                tmp[p3++] = a[p1++];
            } else {
                tmp[p3++] = a[p2++];
            }
        }
        while (p1 <= mid) {
            tmp[p3++] = a[p1++];
        }
        while (p2 <= e) {
            tmp[p3++] = a[p2++];
        }
        int cnt = 0;
        for (int i = s; i <= e; i++) {
            a[i] = tmp[cnt++];
        }
    }

    public static int mergesort(int a[], int s, int e, int tmp[]) {
        int result = 0;
        if (s < e) {
            int mid = s + (e - s) / 2;
            result += mergesort(a, s, mid, tmp);
            result += mergesort(a, mid + 1, e, tmp);
            int i = s, j = mid + 1;
            while (i <= mid && j <= e) {
                if (a[i] <= a[j]) {
                    j++;
                } else {
                    result += e - j + 1;
                    i++;
                }
            }
            merge(a, s, mid, e, tmp);
        }
        return result;
    }
}
