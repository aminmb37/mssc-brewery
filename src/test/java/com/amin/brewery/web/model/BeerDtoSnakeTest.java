package com.amin.brewery.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("snake")
public class BeerDtoSnakeTest extends BaseTest {
    @Test
    public void testBeerDtoSnakeCase() throws JsonProcessingException {
        BeerDto beerDto = getBeerDto();
        String json = objectMapper.writeValueAsString(beerDto);
        System.out.println(json);
    }
}
