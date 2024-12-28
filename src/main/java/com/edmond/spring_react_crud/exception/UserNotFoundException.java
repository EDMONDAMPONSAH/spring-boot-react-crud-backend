package com.edmond.spring_react_crud.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not find user with id " + id);
    }
}
