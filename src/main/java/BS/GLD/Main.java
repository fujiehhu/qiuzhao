package BS.GLD;

import java.util.Scanner;

/**
 * Created by fujie on 20/8/26.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String computer = scanner.nextLine();
            String xiaoming = scanner.nextLine();
            computer = computer.toUpperCase();
            xiaoming = xiaoming.toUpperCase();
            int cl = computer.length();
            int xl = xiaoming.length();
            int low = cl <= xl ? cl : xl;
            int high = low == cl ? xl : cl;

            int count = 0;

            for (int i = 0; i < low; i++) {
                if (computer.charAt(i) == xiaoming.charAt(i)) {
                    count += 20;
                } else {
                    if (count - 10 < 0 ) {
                        count = 0;
                    } else {
                        count -= 10;
                    }
                }
            }
            System.out.println(count);
        }

    }
}
