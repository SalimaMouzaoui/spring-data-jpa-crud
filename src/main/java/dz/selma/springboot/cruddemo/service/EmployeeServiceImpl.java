package dz.selma.springboot.cruddemo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.selma.springboot.cruddemo.dao.EmployeeRepository;
import dz.selma.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRep;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRep) {
		this.employeeRep = employeeRep;
	}

	@Override
	public List<Employee> findAll() {
		return employeeRep.findAll();
	}

	@Override
	public Employee findById(int id) {
		Optional<Employee> result = employeeRep.findById(id);
		
		Employee employee = null;
		
		if (result.isPresent())
			employee = result.get();
		else
			throw new RuntimeException("Didn't find the employee id : " + id);
			
		return employee;
	}

	@Override
	public void save(Employee employee) {
		employeeRep.save(employee);
	}

	@Override
	public void deleteById(int id) {
		employeeRep.deleteById(id);

	}

}
