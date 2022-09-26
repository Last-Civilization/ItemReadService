package com.lastcivilization.itemreadservice.infrastructure.database;

import com.lastcivilization.itemreadservice.domain.Item;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
interface EntityMapper {

    EntityMapper MAPPER = Mappers.getMapper(EntityMapper.class);

    ItemEntity toEntity(Item item);
    Item toDomain(ItemEntity itemEntity);
}
