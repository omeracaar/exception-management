package com.omeracar.exception_management;

import com.omeracar.exception_management.dto.DtoEmployee;
import com.omeracar.exception_management.service.IEmployeeService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = {ExceptionManagementApplication.class})
class ExceptionManagementApplicationTests {

	@Autowired
	private IEmployeeService employeeService;

	@BeforeEach
	public void BeforeEach(){
		System.out.println("beforeEach calisti...");
	}

	@AfterEach
	public void AfterEach(){
		System.out.println("afterEach calisti...");
	}
	@Test
	public void testFindEmployeeById (){
		DtoEmployee employee= employeeService.findEmployeeById(1L);
		if (employee!=null){
			System.out.println("İsim: "+employee.getName());
			assertEquals(1,employee.getId());
		}
	}



}
