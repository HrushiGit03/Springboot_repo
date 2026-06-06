package com.example.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class HelloWorldApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Test GET / endpoint
     */
    @Test
    void testWelcomeEndpoint() throws Exception {
        mockMvc.perform(get("/api/"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello, World!")))
                .andExpect(content().string(containsString("Spring Boot")));
    }

    /**
     * Test GET /hello endpoint with default parameter
     */
    @Test
    void testGreetWithoutParameter() throws Exception {
        mockMvc.perform(get("/api/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, World! Welcome to Spring Boot."));
    }

    /**
     * Test GET /hello endpoint with custom name parameter
     */
    @Test
    void testGreetWithParameter() throws Exception {
        mockMvc.perform(get("/api/hello?name=John"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, John! Welcome to Spring Boot."));
    }

    /**
     * Test GET /user/{id} endpoint
     */
    @Test
    void testGetUserEndpoint() throws Exception {
        mockMvc.perform(get("/api/user/123"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("User ID: 123")));
    }

    /**
     * Test GET /status endpoint
     */
    @Test
    void testStatusEndpoint() throws Exception {
        mockMvc.perform(get("/api/status"))
                .andExpect(status().isOk())
                .andExpect(content().string("Application is running successfully!"));
    }

    /**
     * Test POST /echo endpoint
     */
    @Test
    void testEchoEndpoint() throws Exception {
        mockMvc.perform(post("/api/echo")
                .contentType("application/json")
                .content("Hello Spring Boot"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("You sent: Hello Spring Boot")));
    }

    /**
     * Test GET /info endpoint
     */
    @Test
    void testInfoEndpoint() throws Exception {
        mockMvc.perform(get("/api/info"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Spring Boot Hello World")))
                .andExpect(content().string(containsString("1.0.0")));
    }

    /**
     * Test GET /timestamp endpoint
     */
    @Test
    void testTimestampEndpoint() throws Exception {
        mockMvc.perform(get("/api/timestamp"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Current Timestamp:")));
    }

    /**
     * Test PUT /update/{id} endpoint
     */
    @Test
    void testUpdateUserEndpoint() throws Exception {
        mockMvc.perform(put("/api/update/1")
                .contentType("application/json")
                .content("New Details"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("User 1 updated")));
    }

    /**
     * Test DELETE /delete/{id} endpoint
     */
    @Test
    void testDeleteUserEndpoint() throws Exception {
        mockMvc.perform(delete("/api/delete/1"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("User 1 has been deleted")));
    }
}
