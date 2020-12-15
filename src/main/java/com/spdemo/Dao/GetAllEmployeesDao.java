package com.spdemo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spdemo.Employee;

@Repository
public class GetAllEmployeesDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Employee> getAllEMployees(){
		String selectQuery = "select * from public.\"employee\" ";
		List<Employee> empListObj = jdbcTemplate.query(selectQuery, new EmployeeRowMapper());
		return empListObj;
		}

}
