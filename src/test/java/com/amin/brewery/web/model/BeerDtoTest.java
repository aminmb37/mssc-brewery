package com.amin.brewery.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;

public class BeerDtoTest extends BaseTest {
    @Test
    public void testSerializeBeerDto() throws JsonProcessingException {
        BeerDto beerDto = getBeerDto();
        String jsonString = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonString);
    }

    @Test
    public void testDeserializeBeerDto() throws JsonProcessingException {
        String json = "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"price\":\"12.99\",\"upc\":123123123123,\"createdDate\":\"2020-10-14T15:55:07+0200\",\"lastUpdatedDate\":\"20201014+0200\",\"beerId\":\"dd7a4b06-2867-49fe-8c77-3cbc8fca07fa\"}";
        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);
        System.out.println(beerDto);
    }
}
