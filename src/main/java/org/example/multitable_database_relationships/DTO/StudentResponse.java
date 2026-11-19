package org.example.multitable_database_relationships.DTO;

public record StudentResponse(
        Long id,
        String firstName,
        String lastName,
        String email,
        Long departmentId,
        String departmentName
) {
}
