package com.ejemplo;

import org.junit.jupiter.api.Test;
import problem1.Problem1v1;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestProblem1v1 {

    @Test
    void checkEvenOdd() {
        assertEquals(Problem1v1.process(2), "EVEN");
        assertEquals(Problem1v1.process(3), "ODD");
    }
}
