package com.amin.brewery.web.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class LocalDateDeserializer extends StdDeserializer<OffsetDateTime> {
    public LocalDateDeserializer() {
        super(OffsetDateTime.class);
    }

    @Override
    public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException {
        return OffsetDateTime.of(LocalDate.parse(jsonParser.readValueAs(String.class),
                DateTimeFormatter.BASIC_ISO_DATE), LocalTime.NOON, ZoneOffset.UTC);
    }
}
