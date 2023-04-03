package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCaculatorTest {

    @Test
    void add_should_return_addition() {
        int actual = SimpleCaculator.add(7, 3);
        int expect = 7 + 3;
        assertEquals(expect, actual);
    }

    @Test
    void sub_should_return_subtraction() {
        int actual = SimpleCaculator.sub(2, 3);
        int expect = 2 - 3;
        assertEquals(expect, actual);
    }
}