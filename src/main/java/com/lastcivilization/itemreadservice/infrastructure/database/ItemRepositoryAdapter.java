package com.lastcivilization.itemreadservice.infrastructure.database;

import com.lastcivilization.itemreadservice.domain.Item;
import com.lastcivilization.itemreadservice.domain.port.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.lastcivilization.itemreadservice.infrastructure.database.EntityMapper.MAPPER;

@Service
@RequiredArgsConstructor
class ItemRepositoryAdapter implements ItemRepository {

    private final ItemJpaRepository itemJpaRepository;

    @Override
    public Optional<Item> findById(long id) {
        Optional<ItemEntity> itemEntity = itemJpaRepository.findById(id);
        return itemEntity
                .map(MAPPER::toDomain);
    }

    @Override
    public Item save(Item item) {
        ItemEntity itemEntity = MAPPER.toEntity(item);
        ItemEntity savedItemEntity = itemJpaRepository.save(itemEntity);
        return MAPPER.toDomain(savedItemEntity);
    }
}
