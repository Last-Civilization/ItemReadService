package com.lastcivilization.itemreadservice.domain.port;

import com.lastcivilization.itemreadservice.domain.Item;

import java.util.Optional;

public interface ItemRepository {

    Optional<Item> findById(long id);
}
