package com.lastcivilization.itemreadservice.infrastructure.database;

import com.lastcivilization.itemreadservice.domain.port.ItemRepository;
import com.lastcivilization.itemreadservice.domain.view.ItemModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.lastcivilization.itemreadservice.infrastructure.database.EntityMapper.MAPPER;

@Service
@RequiredArgsConstructor
class ItemRepositoryAdapter implements ItemRepository {

    private final ItemJpaRepository itemJpaRepository;

    @Override
    public Optional<ItemModel> findById(long id) {
        Optional<ItemEntity> itemEntity = itemJpaRepository.findById(id);
        return itemEntity
                .map(MAPPER::toDomain);
    }

    @Override
    public ItemModel save(ItemModel item) {
        ItemEntity itemEntity = MAPPER.toEntity(item);
        ItemEntity savedItemEntity = itemJpaRepository.save(itemEntity);
        return MAPPER.toDomain(savedItemEntity);
    }
}
