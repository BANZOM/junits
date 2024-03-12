package com.banzo.junitexamples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {
    @Test
    public void testReverse() {
        ReverseString rs = new ReverseString();
        assertEquals("cba", rs.reverse("abc"));
        assertEquals("dcba", rs.reverse("abcd"));
        assertEquals("a", rs.reverse("a"));
    }
}
