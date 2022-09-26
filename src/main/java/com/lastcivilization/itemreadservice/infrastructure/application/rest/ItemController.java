package com.lastcivilization.itemreadservice.infrastructure.application.rest;

import com.lastcivilization.itemreadservice.domain.dto.ItemDto;
import com.lastcivilization.itemreadservice.domain.port.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/items")
class ItemController {

    private final ItemService itemService;

    @GetMapping("/{id}")
    ItemDto getItemById(@PathVariable long id){
        return itemService.getItemById(id);
    }
}
