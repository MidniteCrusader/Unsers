package org.example;

class HafenAlreadyExistsException extends RuntimeException {
    public HafenAlreadyExistsException(Long id) {
        super("Hafen mit ID " + id + " existiert bereits.");
    }
    public HafenAlreadyExistsException(String bezeichnung) {
        super("Hafen mit Bezeichnung '" + bezeichnung + "' existiert bereits.");
    }
}