package com.bnmit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GreatestNumberTest {

    @Test
    void testGreatest() {
        GreatestNumber obj = new GreatestNumber();
        assertEquals(10, obj.findGreatest(10, 5));
    }
}