package org.example;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(Long id) {
        super("User mit ID " + id + " existiert bereits.");
    }
    public UserAlreadyExistsException(String name, String email) {
        super("User mit Name '" + name + "' und Email '" + email + "' existiert bereits.");
    }
}
