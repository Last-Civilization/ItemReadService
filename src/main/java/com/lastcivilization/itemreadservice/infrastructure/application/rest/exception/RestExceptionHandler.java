package com.lastcivilization.itemreadservice.infrastructure.application.rest.exception;

import com.lastcivilization.itemreadservice.domain.exception.ItemNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestControllerAdvice
class RestExceptionHandler {

    @ExceptionHandler(ItemNotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    ErrorEntity handleUserNotFoundException(ItemNotFoundException exception){
        return new ErrorEntity(exception.getMessage());
    }
}
