package com.banzo.junitexamples;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    }
}
