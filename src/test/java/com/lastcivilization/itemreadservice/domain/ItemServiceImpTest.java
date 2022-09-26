package com.lastcivilization.itemreadservice.domain;

import com.lastcivilization.itemreadservice.domain.dto.DetailsDto;
import com.lastcivilization.itemreadservice.domain.dto.ItemDto;
import com.lastcivilization.itemreadservice.domain.exception.ItemNotFoundException;
import com.lastcivilization.itemreadservice.domain.port.ItemRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ItemServiceImpTest {

    @Mock
    private ItemRepository itemRepository;

    @InjectMocks
    private ItemServiceImp underTest;

    @Test
    void shouldGetItemById() {
        //given
        ItemDto expectedItemDto = buildItemDto();
        when(itemRepository.findById(anyLong())).thenReturn(Optional.of(buildTestItem()));
        //when
        ItemDto itemDto = underTest.getItemById(anyLong());
        //then
        assertThat(itemDto).isEqualTo(expectedItemDto);
    }

    private Item buildTestItem() {
        return Item.Builder.anItem()
                .id(1L)
                .name("test")
                .details(
                        Details.Builder.aDetails()
                                .id(1L)
                                .build()
                )
                .type(Type.USE)
                .build();
    }

    private ItemDto buildItemDto() {
        return new ItemDto(
                1L,
                "test",
                new DetailsDto(
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