package org.example.multitable_database_relationships.Repository;


import org.example.multitable_database_relationships.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByDepartmentId(Long departmentId);
}
