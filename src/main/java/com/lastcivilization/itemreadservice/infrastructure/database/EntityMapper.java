package com.lastcivilization.itemreadservice.infrastructure.database;

import com.lastcivilization.itemreadservice.domain.view.ItemModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
interface EntityMapper {

    EntityMapper MAPPER = Mappers.getMapper(EntityMapper.class);

    ItemEntity toEntity(ItemModel item);
    ItemModel toDomain(ItemEntity itemEntity);
}
