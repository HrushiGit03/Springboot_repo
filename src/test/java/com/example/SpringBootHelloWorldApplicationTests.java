package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.containsString;

/**
 * Spring Boot Application Tests
 */
@SpringBootTest
@AutoConfigureMockMvc
class SpringBootHelloWorldApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testHelloEndpoint() throws Exception {
        mockMvc.perform(get("/api/hello"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .string(containsString("Hello, World!")));
    }

    @Test
    void testHelloWithNameEndpoint() throws Exception {
        mockMvc.perform(get("/api/hello/John"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .string(containsString("Hello, John!")));
    }

    @Test
    void testHealthCheckEndpoint() throws Exception {
        mockMvc.perform(get("/api/health"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .string(containsString("running successfully")));
    }

}
