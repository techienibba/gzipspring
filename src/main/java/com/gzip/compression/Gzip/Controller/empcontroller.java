package com.gzip.compression.Gzip.Controller;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gzip.compression.Gzip.Entity.Employee;

import io.micrometer.common.util.StringUtils;

@RestController
@RequestMapping("/api/v1")
public class empcontroller {
	UUID uuid = UUID.randomUUID();
	
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getallemps()
	{
		List<Employee> allemps = List.of(new Employee(1,"Mohammed"),new Employee(1,"Mohammed"),new Employee(1,"Mohammed"),new Employee(1,"Mohammed"),new Employee(1,"Mohammed"),new Employee(1,"Mohammed"),new Employee(1,"Mohammed"),new Employee(1,"Mohammed"),new Employee(1,"Mohammed"),new Employee(1,"Mohammed"),new Employee(1,"Mohammed"),new Employee(1,"Mohammed"),new Employee(1,"Mohammed"),new Employee(1,"Mohammed"),new Employee(1,"Mohammed"));
		return ResponseEntity.ok(allemps);
		
		
		
	}
	
	

}
