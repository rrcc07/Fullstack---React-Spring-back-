package com.codewithrrcc.fullsatackbackend.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Long id){
        super("Colud not found the user with id: "+ id);
    }
}
