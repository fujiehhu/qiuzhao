package BS.BDY;

import java.util.*;

/**
 * Created by lenovo on 20/9/14.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zushu = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < zushu; i++) {
            String nm = scanner.nextLine();
            int n = Integer.valueOf(nm.split(" ")[0]);
            int m = Integer.valueOf(nm.split(" ")[1]);

            String qiwangs = scanner.nextLine();
            String[] qiwang = qiwangs.split(" ");

            String jueses = scanner.nextLine();
            String[] juese = jueses.split(" ");
            ArrayList<Integer> list = new ArrayList<>();
            int[] js = new int[juese.length];
            for (int j = 0; j < juese.length; j++) {
                js[j] = Integer.valueOf(juese[j]);
            }
            Arrays.sort(js);

            int res[] = new int[n];
            for (int j = 0; j < qiwang.length; j++) {
                int nn = Integer.valueOf(qiwang[j]);
                int lf = 0, rt = m - 1;
                while (lf<rt){
                    int mid = (lf+rt)/2;
                    if(js[mid]<nn){
                        lf=mid+1;
                    }else {
                        rt = mid;
                    }
                }
                if(lf<m-1) res[j] = m-lf;
                else if(js[m-1]>=nn) res[j]  =1;

            }
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j <n-1; j++) {
               sb.append(res[j]+" ");
            }
            sb.append(res[n-1]);
            System.out.println(sb.toString());
        }
    }
}
