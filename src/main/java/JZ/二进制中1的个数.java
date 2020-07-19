package JZ;


/**
 * Created by lenovo on 20/7/19.
 */
public class 二进制中1的个数 {
    /*
        输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
     */
    /*
    java十进制转换成二进制数
    1.十进制转成二进制
        String s = Integer.toBinaryString(n)  //将十进制数转成字符串，例如n=5 ，s = "101"
    2.将字符串转成整形
        int a = Integer.valueof("1002");  //当然s只能是数字类的字符串
        或者
        int a = Integer.parseInt("1002");
    3.将整形转成字符串
        String s = String.valueof(1025);  直接转成了
    4.将整形转成十六进制的数
        String s = Integer.toHexString(18);   //输出结果12

     */
    public static void main(String[] args) {
        String s = Integer.toBinaryString(-2);
//        System.out.println(s);
        NumberOf1(1);
    }

    public static int NumberOf1(int n) {
        int res = 0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                res++;
            }
        }
        System.out.println(res);
        return res;
    }
}
