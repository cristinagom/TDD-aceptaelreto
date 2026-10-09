import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import problem1.Problem1v1;
import problem1.Solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution {

    @Test
    void checkEvenOdd() {
        assertEquals(Problem1v1.process(2), "EVEN");
        assertEquals(Problem1v1.process(3), "ODD");
    }
    @TempDir
    Path tempDir;

    @Test
    @DisplayName("Test Problem1v0 with input and output files")
    void checkFiles() throws IOException {
        // GIVEN: Direct paths using Path.of
        Path inputPath = Path.of("src/test/resources/test1.in");
        Path expectedOutputPath = Path.of("src/test/resources/test1.out");

        List<String> inputLines = Files.readAllLines(inputPath);
        List<String> expectedOutputLines = Files.readAllLines(expectedOutputPath);

        Path actualOutputPath = tempDir.resolve("output.out");

        // WHEN: Run the processing logic
        Solution.process(inputPath, actualOutputPath);

        // THEN: Verify output content
        String expected = Files.readString(expectedOutputPath);
        String actual = Files.readString(actualOutputPath);

        assertEquals(expected, actual);
    }
}
