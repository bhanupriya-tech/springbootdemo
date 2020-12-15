package com.spdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spdemo.Dao.GetAllEmployeesDao;

@RestController
public class ShowAllEmployeeController {
	@Autowired
	GetAllEmployeesDao getAllempDao;

	@GetMapping("/viewemployee")
	public @ResponseBody List<Employee> GetAllEmployees() {
		List<Employee> empListObj = getAllempDao.getAllEMployees();
		return empListObj;

	}

}
