package BS.PDD;

import java.util.Scanner;

/**
 * Created by lenovo on 20/9/26.
 */
public class Main1 {
    static char a[][] =
            {
                    {0x00, 0x78, 0xcc, 0xcc, 0xcc, 0xcc, 0xcc, 0x78, 0x00, 0x00},//0
                    {0x00, 0x30, 0x70, 0x30, 0x30, 0x30, 0x30, 0x78, 0x00, 0x00},//1
                    {0x00, 0x78, 0xfc, 0x18, 0x30, 0x30, 0x60, 0xfc, 0x00, 0x00},//2
                    {0x00, 0x78, 0xcc, 0x0c, 0x78, 0x0c, 0xcc, 0x78, 0x00, 0x00},//3
                    {0x00, 0x30, 0x70, 0xf0, 0x1b0, 0x1fc, 0x30, 0x30, 0x00, 0x00},//4
                    {0x00, 0xfc, 0xc0, 0xc0, 0xf8, 0x0c, 0xcc, 0x78, 0x00, 0x00},//5
                    {0x00, 0x78, 0xc0, 0xc0, 0xf8, 0xcc, 0xcc, 0x78, 0x00, 0x00},//6
                    {0x00, 0xfc, 0xfc, 0x0c, 0x18, 0x30, 0x60, 0xc0, 0x00, 0x00},//7
                    {0x00, 0x78, 0xcc, 0xcc, 0x78, 0xcc, 0xcc, 0x78, 0x00, 0x00},//8
                    {0x00, 0x78, 0xcc, 0xcc, 0x78, 0x0c, 0x0c, 0x78, 0x00, 0x00}//9
            };


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nn = scanner.nextInt();
        for (int jj = 0; jj < nn; jj++) {
            int N = scanner.nextInt();
            char aa[][] = new char[N][N];
            for (int kk = 0; kk < N; kk++) {
                for (int ii = 0; ii < N; ii++) {
                    aa[kk][ii] = (char) (scanner.nextInt() - '0');
                }
            }
            for (int ll = 0; ll <= 9; ll++) {
                int n = ll, i, j, x;
                int b[] = new int[10];
                loop:
                for (i = 0; i < 10; i++) {
                    x = a[n][i];
                    for (j = 0; j < 10; j++) {
                        b[j] = x % 2;
                        x = x / 2;
                    }
                    for (j = 9; j > 0; j--) {
                        if (((b[j] % 2) + "").equals(a[i][j] + "")) {
                            continue;
                        } else {
                            break loop;
                        }
                    }
                    System.out.println(ll);
                }
            }
        }
    }
}
