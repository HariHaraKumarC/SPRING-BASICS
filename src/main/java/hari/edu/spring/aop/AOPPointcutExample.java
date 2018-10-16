package hari.edu.spring.aop;

import hari.edu.spring.pojo.Customer;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPPointcutExample {

    public static final String SPRING_APPLICATION_CONTEXT_FILE="applicationContext.xml";
    private static final Logger logger=Logger.getLogger(AOPPointcutExample.class);

    public static void main(String[] args) {
        logger.debug("Loading Bean Info from Spring Config File : "+ SPRING_APPLICATION_CONTEXT_FILE);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(SPRING_APPLICATION_CONTEXT_FILE); //spring-context-support dependency
        Customer customer6=(Customer) applicationContext.getBean("customerProxyBean5");
        logger.debug("Printing the Customer 6 details (with AOP Before Advise & Pointcuts mapped by name)...");
        logger.debug(customer6);
        logger.debug("Checking the Customer 6 age (with AOP Before Advise & Pointcuts mapped by name)...");
        customer6.checkAge();
    }
}
