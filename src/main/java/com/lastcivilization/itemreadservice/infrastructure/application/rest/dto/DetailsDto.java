package com.lastcivilization.itemreadservice.infrastructure.application.rest.dto;

public record DetailsDto(
        long id,
        int resistance,
        int damage,
        int strength,
        int dexterity,
        int defense,
        int health,
        int time,
        int lvl
) { }
