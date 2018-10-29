package com.shyali.rest.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.shyali.rest.ejb.EmployeeService;
import com.shyali.rest.entity.Employee;

@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResource {

    @EJB
    private EmployeeService employeeService;

    @GET
    public Response getEmployees() {
        // Read from database
        List<Employee> employees = employeeService.findEmployees();

        return Response.ok(employees).build();
    }

}
