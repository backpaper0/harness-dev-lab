package com.example.api.domains.bar.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(BarController.class)
public class BarControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void testBar() throws Exception {
        mvc.perform(get("/bar")).andExpect(jsonPath("$.name").value("bar"));
    }
}
