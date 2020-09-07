package BS.THS;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Created by lenovo on 20/9/5.
 */
public class main1 {
    public static void main(String[] args) throws ClassNotFoundException{
        Scanner scanner = new Scanner(System.in);
        Class<?> cl = Class.forName("java.lang.String");
        Method []methods = cl.getDeclaredMethods();
        System.out.println(methods.length);
        int i=0;
        for(Method m:methods){
            i++;
            System.out.println(m);
        }
        System.out.println(i);
    }
}
