package com.amananand.DemoDeployment.repo;

import com.amananand.DemoDeployment.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
