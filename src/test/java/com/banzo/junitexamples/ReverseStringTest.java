package com.banzo.junitexamples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    public void testReverse() {
        ReverseString rs = new ReverseString();
        assertEquals("cba", rs.reverse("abc"));
        assertEquals("dcba", rs.reverse("abcd"));
        assertEquals("a", rs.reverse("a"));
        assertEquals("", rs.reverse(""));
        assertEquals("hello there", rs.reverse("ereht olleh"), "Should return the reverse of the string");

        // with supplier lambda
        assertEquals("abc", rs.reverse("cba"), () -> "Should return the reverse of the string");
    }

    @Test
    public void testReverseMore() {
        ReverseString rs = new ReverseString();
        assertNotEquals("abc", rs.reverse("abc"), "It is returning the reverse of the string");
    }
}
