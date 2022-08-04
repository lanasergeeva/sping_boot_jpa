package com.lana.spring.sping_boot_jpa.dao;

import com.lana.spring.sping_boot_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository
        extends JpaRepository<Employee, Integer> {

}
