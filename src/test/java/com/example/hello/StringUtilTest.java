package com.example.hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StringUtilTest {

    @Test
    void testCapitalize() {
        assertEquals("Hello", StringUtil.capitalize("hello"));
    }

    @Test
    void testCapitalizeAlreadyCapitalized() {
        assertEquals("Hello", StringUtil.capitalize("Hello"));
    }

    @Test
    void testCapitalizeEmpty() {
        assertEquals("", StringUtil.capitalize(""));
    }

    @Test
    void testCapitalizeNull() {
        assertNull(StringUtil.capitalize(null));
    }
}
