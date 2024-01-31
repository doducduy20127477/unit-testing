package com.example.unittesting.unittesting;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.print.attribute.standard.Media;

import static org.junit.jupiter.api.Assertions.assertEquals;

@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest {
    @Autowired
    private MockMvc mockMvc;

    // IT NOT WORKING
//    private final MockMvc mockMvc;
//
//    public HelloWorldControllerTest (MockMvc mockMvc) {
//        this.mockMvc = mockMvc;
//    }

    @Test
    public void helloWorld_basic() throws Exception {
        // call GET "/hello-world" application/json
        RequestBuilder request = MockMvcRequestBuilders
                .get("/hello-world")
                .accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(request).andReturn();

        // verify response
        assertEquals("Hello World", result.getResponse().getContentAsString());
    }
}
