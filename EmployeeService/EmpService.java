package com.greatlearning.EmployeeService;

import com.greatlearning.model.Employee;

public interface EmpService {
	String generateEmailId(String firstname, String lastname,String dept);
	String generatePassword();
	void showDetails(Employee e1);
}
