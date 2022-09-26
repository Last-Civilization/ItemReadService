package com.lastcivilization.itemreadservice.domain;

import com.lastcivilization.itemreadservice.domain.exception.ItemNotFoundException;
import com.lastcivilization.itemreadservice.domain.port.ItemRepository;
import com.lastcivilization.itemreadservice.domain.view.DetailsModel;
import com.lastcivilization.itemreadservice.domain.view.ItemModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ItemServiceTest {

    @Mock
    private ItemRepository itemRepository;

    @InjectMocks
    private ItemService underTest;

    @Test
    void shouldGetItemById() {
        //given
        ItemModel expectedItemModel = buildItemModel();
        when(itemRepository.findById(anyLong())).thenReturn(Optional.of(expectedItemModel));
        //when
        ItemModel itemModel = underTest.getItemById(anyLong());
        //then
        assertThat(itemModel).isEqualTo(expectedItemModel);
    }

    private ItemModel buildItemModel() {
        return new ItemModel(
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
    }

    @Test
    void shouldReturnItemNotFoundExceptionWhileGettingItemById() {
        //given
        when(itemRepository.findById(anyLong())).thenReturn(Optional.empty());
        //when
        Executable getExecutable = () -> underTest.getItemById(anyLong());
        //then
        assertThrows(ItemNotFoundException.class, getExecutable);
    }
}