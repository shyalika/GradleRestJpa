package com.shyali.rest.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/v1")
public class HelloWorldApplication extends Application {

    private Set<Class<?>> singletons = new HashSet<>();

    public HelloWorldApplication() {
        singletons.add(EmployeeService.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return singletons;
    }
}
