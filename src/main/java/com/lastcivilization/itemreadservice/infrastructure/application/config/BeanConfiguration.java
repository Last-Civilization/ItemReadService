package com.lastcivilization.itemreadservice.infrastructure.application.config;

import com.lastcivilization.itemreadservice.domain.ItemService;
import com.lastcivilization.itemreadservice.domain.port.ItemRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@Configuration
@EntityScan("com.lastcivilization.itemreadservice.infrastructure.database")
@EnableJpaRepositories("com.lastcivilization.itemreadservice.infrastructure.database")
@ComponentScan("com.lastcivilization.itemreadservice")
class BeanConfiguration {

    @Bean
    ItemService itemService(ItemRepository itemRepository){
        return new ItemService(itemRepository);
    }
}
