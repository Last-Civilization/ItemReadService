package com.lastcivilization.itemreadservice.domain;

import com.lastcivilization.itemreadservice.domain.dto.DetailsDto;
import com.lastcivilization.itemreadservice.domain.dto.ItemDto;

class Mapper {

    static ItemDto toDto(Item item){
        Type type = item.getType();
        return new ItemDto(
                item.getId(),
                item.getName(),
                toDto(item.getDetails()),
                type.toString()
        );
    }

    private static DetailsDto toDto(Details details) {
        return new DetailsDto(
                details.getId(),
                details.getResistance(),
                details.getDamage(),
                details.getStrength(),
                details.getDexterity(),
                details.getDefense(),
                details.getHealth(),
                details.getTime(),
                details.getLvl()
        );
    }
}
