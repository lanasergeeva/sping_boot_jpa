package com.lana.spring.sping_boot_jpa.service;

import com.lana.spring.sping_boot_jpa.dao.EmployeeRepository;
import com.lana.spring.sping_boot_jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Optional<Employee> byId = employeeRepository.findById(id);
        return byId.isPresent() ? byId.get() : null;

    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}