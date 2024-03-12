package com.banzo.junitexamples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MiscellaneousTest {
    @Test
    public void test1() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};

        assertArrayEquals(expected, actual);
    }
}
