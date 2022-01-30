package com.axonactive.sample.dao;


import com.axonactive.sample.entities.Department;

public interface DepartmentDAO {
    public Department findDepartmentById(Long id);
}
