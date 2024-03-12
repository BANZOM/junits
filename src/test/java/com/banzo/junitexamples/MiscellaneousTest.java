package com.banzo.junitexamples;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class MiscellaneousTest {
    @Test
    public void test1() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] actual = {1, 2, 3};

        assertTimeout(Duration.ofMillis(100), () -> {
            for (int i = 0; i < 1000000; i++) {
                int[] copy = new int[actual.length];
                System.arraycopy(actual, 0, copy, 0, actual.length);
            }
        });
    }
}
