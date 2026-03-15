package com.example.api.domains.foo.controller;

import com.example.api.platform.utils.ControllerUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo")
public class FooController {
    @GetMapping
    public Object bar() {
        return ControllerUtil.response("foo");
    }
}
