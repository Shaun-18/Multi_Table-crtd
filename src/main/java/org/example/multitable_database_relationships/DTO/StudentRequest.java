package org.example.multitable_database_relationships.DTO;

public record StudentRequest(
        String firstName,
        String lastName,
        String email,
        Long departmentId) {
}
