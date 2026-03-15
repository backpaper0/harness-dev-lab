package com.example.api.domains.foo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(FooController.class)
public class FooControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void testFoo() throws Exception {
        mvc.perform(get("/foo")).andExpect(jsonPath("$.name").value("foo"));
    }
}
