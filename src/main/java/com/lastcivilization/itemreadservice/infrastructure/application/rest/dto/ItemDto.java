package com.lastcivilization.itemreadservice.infrastructure.application.rest.dto;

public record ItemDto (
        long id,
        String name,
        DetailsDto details,
        String type
) { }
