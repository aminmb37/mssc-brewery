package com.amin.brewery.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
public class BeerDtoKebabTest extends BaseTest {
    @Test
    public void testBeerDtoKebabCase() throws JsonProcessingException {
        BeerDto beerDto = getBeerDto();
        String json = objectMapper.writeValueAsString(beerDto);
        System.out.println(json);
    }
}
