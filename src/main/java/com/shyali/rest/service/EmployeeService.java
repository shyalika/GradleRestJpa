package com.shyali.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/employees")
public class EmployeeService {

    @GET
    public String getEmployees() {
        // Just returning a string as a test
        return "Hello Employees";
    }

}
