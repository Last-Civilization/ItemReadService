package com.lastcivilization.itemreadservice.domain;

import com.lastcivilization.itemreadservice.domain.exception.ItemNotFoundException;
import com.lastcivilization.itemreadservice.domain.port.ItemRepository;
import com.lastcivilization.itemreadservice.domain.view.ItemModel;
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    
    public ItemModel getItemById(long id) {
        ItemModel itemModel = getItem(id);
        Item item = Mapper.toDomain(itemModel);
        return Mapper.toModel(item);
    }

    private ItemModel getItem(long id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException(id));
    }
}
