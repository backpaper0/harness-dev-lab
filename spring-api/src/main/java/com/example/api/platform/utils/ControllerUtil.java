package com.example.api.platform.utils;

import java.util.Map;

public class ControllerUtil {
    public static Object response(String name) {
        return Map.of("name", name);
    }
}
