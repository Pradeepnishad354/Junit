package com.tag.service;

import java.util.List;

import com.tag.entity.Department;

public interface DepartmentService {


     Department SaveDepartment(Department department);

     List<Department> fetchDepartmentList();

     public Department getDepartmentById(Long id);

     void deleteDepartmentById(Long departmentId);

      Department updateDepartment( Department department, Long departmentId);



}
