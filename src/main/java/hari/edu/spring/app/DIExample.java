package hari.edu.spring.app;

import hari.edu.spring.pojo.Employee;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIExample {
    public static final String SPRING_APPLICATION_CONTEXT_FILE="applicationContext.xml";
    private static final Logger logger=Logger.getLogger(DIExample.class);
    public static void main(String[] args){
        logger.debug("Loading Bean Info from Spring Config File : "+ SPRING_APPLICATION_CONTEXT_FILE);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(SPRING_APPLICATION_CONTEXT_FILE); //spring-context-support dependency
        Employee employee=(Employee) applicationContext.getBean("employeeBean");
        logger.debug("Printing the employee details...");
        logger.debug("Employee Id > "+employee.getId());
        logger.debug("Employee Name > "+employee.getName());
        logger.debug("Employee Address > "+employee.getAddress());
        logger.debug("Employee has a dependency with Address Object. Address Object is injected to Employee Object via Constructor based DI..");
    }
}
