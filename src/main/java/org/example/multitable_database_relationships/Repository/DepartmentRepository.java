package org.example.multitable_database_relationships.Repository;

import org.example.multitable_database_relationships.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;




public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
