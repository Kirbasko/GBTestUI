package org.example.l4;

import org.junit.jupiter.api.Test;

import static org.example.l4.TypeForTriangle.INVALID;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @Test
    public void testMinus() {
        final TypeForTriangle type = Triangle.classify(-1, 1, 1);
        assertEquals(INVALID, type);
    }
    @Test
    public void testMinus2() {
        final TypeForTriangle type = Triangle.classify(1, -1, 1);
        assertEquals(INVALID, type);
    }
    @Test
    public void testMinus3() {
        final TypeForTriangle type = Triangle.classify(1, 1, -1);
        assertEquals(INVALID, type);
    }
    @Test
    public void testForNull() {
        final TypeForTriangle type = Triangle.classify(0, 3, 5);
        assertEquals(INVALID, type);
    }
    @Test
    public void testForNull2() {
        final TypeForTriangle type = Triangle.classify(3, 0, 5);
        assertEquals(INVALID, type);
    }
    @Test
    public void testForNull3() {
        final TypeForTriangle type = Triangle.classify(5, 3, 0);
        assertEquals(INVALID, type);
    }
}
