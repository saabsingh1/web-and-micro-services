package org.acme;

public class PersonException extends Exception{

    private static final long serialVersionUID = 1L;
    public PersonException(String message) {
        super(message);
    }
}
