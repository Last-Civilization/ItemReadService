package com.lastcivilization.itemreadservice.infrastructure.application.rest;

import com.lastcivilization.itemreadservice.utils.IntegrationBaseClass;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class ItemControllerTest extends IntegrationBaseClass {

    @Test
    void shouldGetItemById() throws Exception {
        //given
        //when
        ResultActions getResult = mockMvc.perform(get("/items/1"));
        //then
        getResult.andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.name").value("test"))
                .andExpect(jsonPath("$.type").value("USE"))
                .andExpect(jsonPath("$.details.id").value(1))
                .andExpect(jsonPath("$.details.resistance").value(0))
                .andExpect(jsonPath("$.details.damage").value(0))
                .andExpect(jsonPath("$.details.strength").value(0))
                .andExpect(jsonPath("$.details.dexterity").value(0))
                .andExpect(jsonPath("$.details.defense").value(0))
                .andExpect(jsonPath("$.details.health").value(0))
                .andExpect(jsonPath("$.details.time").value(0))
                .andExpect(jsonPath("$.details.lvl").value(0));
    }

    @Test
    void shouldReturnInvalidExceptionStatusWhileGettingItemById() throws Exception {
        //given
        //when
        ResultActions getResult = mockMvc.perform(get("/items/0"));
        //then
        getResult.andExpect(status().isBadRequest());
    }

    @Test
    void shouldReturnItemNotFoundStatusWhileGettingItemyById() throws Exception {
        //given
        //when
        ResultActions getResult = mockMvc.perform(get("/items/2"));
        //then
        getResult.andExpect(status().isNotFound());
    }
}