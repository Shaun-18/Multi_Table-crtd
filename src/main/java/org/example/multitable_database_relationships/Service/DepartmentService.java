package org.example.multitable_database_relationships.Service;


import org.example.multitable_database_relationships.DTO.DepartmentRequest;
import org.example.multitable_database_relationships.DTO.DepartmentResponse;

import java.util.List;

public interface DepartmentService {

    DepartmentResponse create(DepartmentRequest request);

    List<DepartmentResponse> findAll();

    DepartmentResponse findById(Long id);
}