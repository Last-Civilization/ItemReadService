package com.lastcivilization.itemreadservice.domain.exception;

public class ItemNotFoundException extends RuntimeException {

    public ItemNotFoundException(long id) {
        super("Can not found item with id: %d".formatted(id));
    }
}
