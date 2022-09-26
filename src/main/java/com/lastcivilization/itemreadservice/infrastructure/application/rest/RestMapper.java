package com.lastcivilization.itemreadservice.infrastructure.application.rest;

import com.lastcivilization.itemreadservice.domain.view.ItemModel;
import com.lastcivilization.itemreadservice.infrastructure.application.rest.dto.ItemDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
interface RestMapper {

    RestMapper MAPPER = Mappers.getMapper(RestMapper.class);

    ItemDto toDto(ItemModel itemModel);
}
