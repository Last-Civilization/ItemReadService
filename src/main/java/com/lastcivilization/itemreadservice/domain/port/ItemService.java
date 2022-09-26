package com.lastcivilization.itemreadservice.domain.port;

import com.lastcivilization.itemreadservice.domain.dto.ItemDto;

public interface ItemService {

    ItemDto getItemById(long id);
}
