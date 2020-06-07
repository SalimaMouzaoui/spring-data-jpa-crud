package dz.selma.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dz.selma.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
