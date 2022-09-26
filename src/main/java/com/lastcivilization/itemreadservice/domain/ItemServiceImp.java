package com.lastcivilization.itemreadservice.domain;

import com.lastcivilization.itemreadservice.domain.dto.ItemDto;
import com.lastcivilization.itemreadservice.domain.exception.ItemNotFoundException;
import com.lastcivilization.itemreadservice.domain.port.ItemRepository;
import com.lastcivilization.itemreadservice.domain.port.ItemService;

public class ItemServiceImp implements ItemService {

    private final ItemRepository itemRepository;

    public ItemServiceImp(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public ItemDto getItemById(long id) {
        Item item = getItem(id);
        return Mapper.toDto(item);
    }

    private Item getItem(long id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException(id));
    }
}
