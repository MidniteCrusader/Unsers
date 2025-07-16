package org.example;


class HafenDoesNotExistException extends RuntimeException {
    public HafenDoesNotExistException(Long id) {
        super("Hafen mit ID " + id + " existiert nicht.");
    }
    public HafenDoesNotExistException(String bezeichnung) {
        super("Hafen mit Bezeichnung '" + bezeichnung + "' existiert nicht.");
    }
}
