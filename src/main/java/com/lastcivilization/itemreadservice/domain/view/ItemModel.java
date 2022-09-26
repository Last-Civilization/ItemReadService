package com.lastcivilization.itemreadservice.domain.view;

public record ItemModel(
        Long id,
        String name,
        DetailsModel details,
        String type
) { }
