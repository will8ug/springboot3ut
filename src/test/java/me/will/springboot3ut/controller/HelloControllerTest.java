package me.will.springboot3ut.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@AutoConfigureMockMvc
class HelloControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void testHello_EmptyParameters() throws Exception {
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/hello"));
        resultActions.andExpect(MockMvcResultMatchers.status().isOk()).andDo(print());
        resultActions.andExpect(MockMvcResultMatchers.content().string("Hey there!"));
    }

    @Test
    void testHello_EmptyParameters_ExpectInAnotherWay() throws Exception {
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/hello"));
        resultActions.andExpect(MockMvcResultMatchers.status().isOk()).andDo(print());
        assertEquals("Hey there!", resultActions.andReturn().getResponse().getContentAsString());
    }

    @Test
    void testHello_NonEmptyParameters() throws Exception {
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders
                .get("/hello")
                .param("name", "Bob")
        );
        resultActions.andExpect(MockMvcResultMatchers.status().isOk()).andDo(print());
        resultActions.andExpect(MockMvcResultMatchers.content().string("Hello Bob!"));
    }
}