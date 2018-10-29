# Example Annotation driven REST service using gradle.

This project is a simple example to build and deploy a REST web service with no wel.xml file. This is intended to be deployed in Jboss 7.1 which is a Servlet 3 compatible server. @ApplicationPath annotation implemented with the an extended javax.ws.rs.core.Application provides the web mapping support without a web.xml file.


1. Checkout the project and navigate to the project folder

6. Run the command ```gradle init```

7. Build the projcet using ```gradle clean assemble``` command

8. Copy the GradleResy.war file to the JBOSS_HOME/standalone/deployments directory

9. Start Jboss

19. Access the REST GET enpoint using http://localhost:8080/GradleRest/v1/employees
