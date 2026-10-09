package problem1;

import java.io.IOException;
import java.util.Scanner;

/* 1. Write a program that reads a sequence of integers from the keyboard and prints "EVEN" if the number is even and "ODD" otherwise. */
/* Solution: read from keyboard, all inside main*/
public class Problem1v0 {

    public static void main(String[] args) throws IOException {
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
