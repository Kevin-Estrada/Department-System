package com.kevinestrada.departmentsystem.controller;

import com.kevinestrada.departmentsystem.entity.Department;
import com.kevinestrada.departmentsystem.service.DepartmentService;
import com.kevinestrada.departmentsystem.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }
}
