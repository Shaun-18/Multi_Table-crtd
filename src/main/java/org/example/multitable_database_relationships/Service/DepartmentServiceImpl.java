package org.example.multitable_database_relationships.Service;

import org.example.multitable_database_relationships.Entity.Department;
import org.example.multitable_database_relationships.Exceptions.ResourceNotFoundException;
import org.example.multitable_database_relationships.Repository.DepartmentRepository;
import org.springframework.stereotype.Service;
import org.example.multitable_database_relationships.DTO.*;

import java.util.List;


@Service
public class DepartmentServiceImpl implements DepartmentService {
    public DepartmentServiceImpl(
            DepartmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public DepartmentResponse create(
            DepartmentRequest request) {

        Department department = new Department(
                request.name(),
                request.description()
        );

        Department saved = repository.save(department);

        return mapToResponse(saved);
    }

    @Override
    public List<DepartmentResponse> findAll() {

        return repository.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    @Override
    public DepartmentResponse findById(Long id) {

        Department department = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Department not found: " + id
                        ));

        return mapToResponse(department);
    }

    private DepartmentResponse mapToResponse(
            Department department) {

        return new DepartmentResponse(
                department.getId(),
                department.getName(),
                department.getDescription()
        );
    }
}
