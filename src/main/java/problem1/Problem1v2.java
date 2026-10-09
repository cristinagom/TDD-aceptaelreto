package problem1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* Solution: read input from file, process method could be tested independently  */

public class Problem1v2 {
    public static String process(int number) {
        return (number % 2 == 0) ? "EVEN": "ODD";
    };
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in);
        Path inputPath = Path.of("src/java/resources/test1.in");

        Files.lines(inputPath).map(s -> process(Integer.parseInt(s))).forEach(System.out::println);
    }
}
