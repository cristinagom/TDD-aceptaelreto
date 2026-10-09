package com.ejemplo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import problem1.Problem1v0;
import problem1.Problem1v111;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestProblem1V0 {

    @Test
    void checkEvenOdd() {
        assertEquals(Problem1v1.process(2), "EVEN");
        assertEquals(Problem1v111.process(3), "ODD");
    }
    @TempDir
    Path tempDir;

    @Test
    @DisplayName("Test Problem1v0 with input and output files")
    void check() throws IOException {
        // GIVEN: Direct paths using Path.of
        Path inputPath = Path.of("src/test/resources/test1.in");
        Path expectedOutputPath = Path.of("src/test/resources/test1.out");

        Path actualOutputPath = tempDir.resolve("output.out");
        Problem1v111 problem1 = new Problem1v111();

        // WHEN: Run the processing logic
        //problem1.process(inputPath, actualOutputPath);

        // THEN: Verify output content after normalizing line endings (\r\n to \n)
        String expected = Files.readString(expectedOutputPath).replace("\r\n", "\n").strip();
        String actual = Files.readString(actualOutputPath).replace("\r\n", "\n").strip();

        assertEquals(expected, actual);
    }

}
