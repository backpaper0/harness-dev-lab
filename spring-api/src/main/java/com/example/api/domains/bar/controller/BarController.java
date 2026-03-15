package com.example.api.domains.bar.controller;

import com.example.api.platform.utils.ControllerUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bar")
public class BarController {
    @GetMapping
    public Object bar() {
        return ControllerUtil.response("bar");
    }
}
