package com.banzo.junitexamples;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MiscellaneousTest {

    MiscellaneousTest() {
        System.out.println("Constructor");
    }

    @BeforeEach
    public void init() {
        System.out.println("Initializing test");
    }

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

    @Test
    public void test3() {
        int[] actual = {1, 2, 3};

        assertThrows(Exception.class, () -> {
            int x = actual[3];
        });
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Tearing down test");
    }
}
