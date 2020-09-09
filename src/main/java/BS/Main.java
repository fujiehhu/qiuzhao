package BS;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("1");
        for (int i = 1; i <= 1000; i++) {
            BigInteger bi2 = new BigInteger(i + "");
            bi1 = bi2.multiply(bi1);
        }
        StringBuffer sb = new StringBuffer(bi1.toString());
        String str2 = sb.reverse().toString();

        int count2 = 0;
        for (int i = 0; i < str2.length(); i++) {
            if ('0' == str2.charAt(i)) {
                count2 += 1;
            } else {
                break;
            }
        }
        System.out.println(count2);
    }
}

