package org.example.multitable_database_relationships.Service;

import org.example.multitable_database_relationships.DTO.StudentRequest;
import org.example.multitable_database_relationships.DTO.StudentResponse;

import java.util.List;

public interface StudentService {

    StudentResponse create(StudentRequest request);

    List<StudentResponse> findAll();

    StudentResponse findById(Long id);

    List<StudentResponse> findByDepartment(Long departmentId);
}