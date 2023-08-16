package com.security.repository;

import com.security.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee,Integer> {
    public Employee findByEmail(String email);
}
