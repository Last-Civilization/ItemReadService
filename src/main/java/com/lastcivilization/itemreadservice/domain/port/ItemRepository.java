package com.lastcivilization.itemreadservice.domain.port;

import com.lastcivilization.itemreadservice.domain.view.ItemModel;

import java.util.Optional;

public interface ItemRepository {

    Optional<ItemModel> findById(long id);

    ItemModel save(ItemModel item);
}
