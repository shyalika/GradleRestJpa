package com.shyali.rest.ejb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.shyali.rest.entity.Employee;

@Stateless
public class EmployeeService {

    @PersistenceContext
    protected EntityManager entityManager;

    @PostConstruct
    public void post() {
        System.out.println("Test");
    }

    public List<Employee> findEmployees() {

        TypedQuery<Employee> query = entityManager.createNamedQuery(
                "Employee.findAll", Employee.class);

        return query.getResultList();

    }
}
