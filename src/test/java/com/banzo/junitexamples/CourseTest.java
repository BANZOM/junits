package com.banzo.junitexamples;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CourseTest {

    @Test
    public void testIsComplete() {
        Course c = new Course();
        assertTrue(c.isComplete());
    }
}
