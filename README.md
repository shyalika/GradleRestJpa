# Example Annotation driven REST (with Jpa) service using gradle.

This project is a simple example to build and deploy a REST web service with no wel.xml file. This is intended to be deployed in Jboss 7.1 which is a Servlet 3 compatible server. @ApplicationPath annotation implemented with the an extended javax.ws.rs.core.Application provides the web mapping support without a web.xml file.


1. Create the database and tables using the script provided in database/scripts directory.

2. Copy the standalone.xml in the database/ directory to the JBOSS_HOME/standalone/configuration directory or update the datasources section accordingly.

3. Install mysql-connector into jboss as a module
	* create the folder structure JBOSS_HOME/modules/com/mysql/main and copy the mysql connector jar to that location
	* copy the module.xml file in the database directory to the same location. NOTE: match the module name in the module.xml file to the standalone.xml


4. Checkout the project and navigate to the project folder

6. Run the command ```gradle init```

7. Build the projcet using ```gradle clean assemble``` command

8. Copy the GradleRestJpa.war file to the JBOSS_HOME/standalone/deployments directory

9. Start Jboss

10. Access the REST GET enpoint using http://localhost:8080/GradleRestJpa/v1/employees
