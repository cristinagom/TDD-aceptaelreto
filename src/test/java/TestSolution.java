import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import problem1.Problem1v1;
import problem1.Problem1v3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblemv3 {

    @Test
    void checkEvenOdd() {
        assertEquals(Problem1v1.process(2), "EVEN");
        assertEquals(Problem1v1.process(3), "ODD");
    }
    @TempDir
    Path tempDir;

    @Test
    @DisplayName("Test Problem1v0 with input and output files")
    void check() throws IOException {
        // GIVEN: Direct paths using Path.of
        Path inputPath = Path.of("src/test/resources/test1.in");
        Path expectedOutputPath = Path.of("src/test/resources/test1.out");

        Path actualOutputPath = tempDir.resolve("src/test/resources/output.out");

        // WHEN: Run the processing logic
        Problem1v3.process(inputPath, actualOutputPath);

        // THEN: Verify output content
        String expected = Files.readString(expectedOutputPath);
        String actual = Files.readString(actualOutputPath);

        assertEquals(expected, actual);
    }
}
