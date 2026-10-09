package problem1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem1v1 {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in);
        int number;
        while (keyboard.hasNextLine()) {
            number = Integer.parseInt(keyboard.nextLine());
            if (number % 2 == 0) {
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");
            }
        }
    }
}
