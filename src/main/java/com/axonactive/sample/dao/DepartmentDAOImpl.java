package com.axonactive.sample.dao;

import com.axonactive.sample.entities.Department;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DepartmentDAOImpl implements DepartmentDAO{

//    unitName must be same in persistence.xml
    @PersistenceContext(unitName = "sample")
    private EntityManager entityManager;

    @Override
    public Department findDepartmentById(Long id) {
        return entityManager.find(Department.class, id);
    }

}