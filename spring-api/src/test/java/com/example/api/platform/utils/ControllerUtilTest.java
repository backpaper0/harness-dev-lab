package com.example.api.platform.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Test;

public class ControllerUtilTest {
    @Test
    void testResponse() {
        assertEquals(Map.of("name", "foobar"), ControllerUtil.response("foobar"));
    }
}
