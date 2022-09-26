package com.lastcivilization.itemreadservice.infrastructure.application.config;

import com.lastcivilization.itemreadservice.domain.ItemServiceImp;
import com.lastcivilization.itemreadservice.domain.port.ItemRepository;
import com.lastcivilization.itemreadservice.domain.port.ItemService;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.lastcivilization.itemreadservice.infrastructure.database")
@EnableJpaRepositories("com.lastcivilization.itemreadservice.infrastructure.database")
@ComponentScan("com.lastcivilization.itemreadservice")
class BeanConfiguration {

    @Bean
    ItemService itemService(ItemRepository itemRepository){
        return new ItemServiceImp(itemRepository);
    }
}