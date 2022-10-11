package com.tag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import com.tag.controller.DepartmentController;
import com.tag.entity.Department;
import com.tag.service.DepartmentServiceImpl;


public class DepartmentControllerTest {
	
	
	@InjectMocks
	private DepartmentController departmentController;

	@Mock
	private DepartmentServiceImpl departmentServiceImpl;
	
	public DepartmentControllerTest() {
		MockitoAnnotations.openMocks(this);
		
	}
	
	@Test
	public void fetchDepartmentlistTest() {
		
		List<Department> department=new ArrayList<Department>();
		
		department.add(new Department((long) 1,"CSE","ahemdabad","11"));
		department.add(new Department((long) 2,"MEC","Gujrat","12"));
		
		//when //then
		when(departmentServiceImpl.fetchDepartmentList()).thenReturn(department);
		
		
		//assert test
		List<Department> department2=departmentController.fetchDepartmentList();
		assertEquals(2,department2.size());
		
		verify(departmentServiceImpl,times(1)).fetchDepartmentList();
	}
	
	@Test
	public void saveDepartmentTest() {
		Department dp=new Department((long) 1,"EN","Ahemdabad","02");
		
		departmentController.saveDepartment(dp);
		
		verify(departmentServiceImpl,times(1)).SaveDepartment(dp);
		
	}
	
	//Test  get department by id 
	
	@Test
	public void getDepartmentByIdTest() {
		
		when(departmentServiceImpl.getDepartmentById((long) 1)).thenReturn(new Department((long) 1,"CSE","Ahemdabad","001"));
		
	Department dpt=departmentController.getDepartmentById((long) 1);
	
	assertEquals("CSE",dpt.getDepartmentName());
	assertEquals("Ahemdabad",dpt.getDepartmentAddress());
	assertEquals("001",dpt.getDepartmentCode());
	
		
		
	}
	
	
	
	
}
