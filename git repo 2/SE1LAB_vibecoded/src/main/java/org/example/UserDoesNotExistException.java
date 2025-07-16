package org.example;

public class UserDoesNotExistException extends RuntimeException {
    public UserDoesNotExistException(Long id) {
        super("User mit ID " + id + " existiert nicht.");
    }

   /* public UserDoesNotExistException(String name) {
        super("User mit Name '" + name + "' existiert nicht.");
    }*/

    public UserDoesNotExistException(String email) {
        super("User mit Email '" + email + "' existiert nicht.");
    }
}
