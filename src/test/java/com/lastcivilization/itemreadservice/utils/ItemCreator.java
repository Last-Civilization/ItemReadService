package com.lastcivilization.itemreadservice.utils;

import com.lastcivilization.itemreadservice.domain.port.ItemRepository;
import com.lastcivilization.itemreadservice.domain.view.DetailsModel;
import com.lastcivilization.itemreadservice.domain.view.ItemModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class ItemCreator {

    private final ItemRepository itemRepository;

    public void resetTestItemDetails() {
        ItemModel item = new ItemModel(
                1L,
                "test",
                new DetailsModel(
                        1L,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0
                ),
                "USE"
        );
        itemRepository.save(item);
    }
}
