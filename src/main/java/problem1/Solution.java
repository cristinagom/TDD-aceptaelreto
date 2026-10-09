package problem1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static String process(int number) {
        return (number % 2 == 0) ? "EVEN": "ODD";
    };

    public static void process(Path inputPath, Path outputPath) throws IOException {
        List<String> lines = Files.readAllLines(inputPath);
        if (lines.isEmpty()) return;

        List<String> results = lines.stream()
                .filter(line -> !line.isBlank())
                .map(String::trim)
                .map(Integer::parseInt)
                .map(Solution::process)
                .toList();

        Files.write(outputPath, results, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }


    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int number;
        while (keyboard.hasNextLine()) {
            number = Integer.parseInt(keyboard.nextLine());
            System.out.println(process(number));
        }
    }

}
