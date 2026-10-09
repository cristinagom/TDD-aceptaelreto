package problem1;

import java.io.IOException;
import java.util.Scanner;

/* Solution: read from keyboard, extract process method (this method could be tested independently) */
public class Problem1v1 {

    public static String process(int number) {
        if (number % 2 == 0) {
            return "EVEN";
        } else {
            return "ODD";
        }
    };

    /* Alternative solution with ternary operator */
    public static String process2(int number) {
        return (number % 2 == 0) ? "EVEN": "ODD";
    };


    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int number;
        while (keyboard.hasNextLine()) {
            number = Integer.parseInt(keyboard.nextLine());
            System.out.println(process(number));
        }
    }
}
