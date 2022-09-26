package com.lastcivilization.itemreadservice.infrastructure.application.rest;

import com.lastcivilization.itemreadservice.domain.ItemService;
import com.lastcivilization.itemreadservice.domain.view.ItemModel;
import com.lastcivilization.itemreadservice.infrastructure.application.rest.dto.ItemDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.lastcivilization.itemreadservice.infrastructure.application.rest.RestMapper.MAPPER;

@RestController
@RequiredArgsConstructor
@RequestMapping("/items")
class ItemController {

    private final ItemService itemService;

    @GetMapping("/{id}")
    ItemDto getItemById(@PathVariable long id){
        ItemModel itemModel = itemService.getItemById(id);
        return MAPPER.toDto(itemModel);
    }
}
