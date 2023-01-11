package com.orderssytem.orderssystem.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id) {
        super("Couldn't find an entity with the provided id: " + id);
    }

}
