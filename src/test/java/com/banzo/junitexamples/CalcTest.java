package com.banzo.junitexamples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    public void testDivide() {
        Calc c = new Calc();
        assertEquals(5, c.divide(10, 2));
        assertEquals(10, c.divide(10, 0));
    }
}
