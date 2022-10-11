package com.tag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tag.entity.Department;
import com.tag.service.DepartmentService;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
    	return departmentService.SaveDepartment(department);
    	
         

    }
    
    
    @GetMapping("/department")
    public List<Department> fetchDepartmentList()
    {
    	 return  departmentService.fetchDepartmentList();
         
    }
    
    
    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id) {
   return departmentService.getDepartmentById(id);
    	 
    }
    
    
    
@DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){

        departmentService.deleteDepartmentById(departmentId);
        return "department deleted successfully";


    }
    @PutMapping("/department/{id}")
    public Department updateDepartment(@RequestBody Department department,
                                       @PathVariable("id") Long departmentId){
    	
       return  departmentService.updateDepartment(department, departmentId);
        
    }


}
