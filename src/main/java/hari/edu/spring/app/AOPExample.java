package hari.edu.spring.app;

import hari.edu.spring.pojo.Customer;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPExample {

    public static final String SPRING_APPLICATION_CONTEXT_FILE="applicationContext.xml";
    private static final Logger logger=Logger.getLogger(AOPExample.class);

    public static void main(String[] args) {
        logger.debug("Loading Bean Info from Spring Config File : "+ SPRING_APPLICATION_CONTEXT_FILE);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(SPRING_APPLICATION_CONTEXT_FILE); //spring-context-support dependency
        Customer customer1=(Customer) applicationContext.getBean("customerBean1");
        logger.debug("Printing the Customer 1 details (without AOP)...");
        logger.debug(customer1);
        logger.debug("Checking the Customer 1 age (without AOP)...");
        customer1.checkAge();
        Customer customer2=(Customer) applicationContext.getBean("customerProxyBean1");
        logger.debug("Printing the Customer 2 details (with AOP Before Advise)...");
        logger.debug(customer2);
        logger.debug("Checking the Customer 2 age (with AOP Before Advise)...");
        customer2.checkAge();
        Customer customer3=(Customer) applicationContext.getBean("customerProxyBean2");
        logger.debug("Printing the Customer 3 details (with AOP After Advise)...");
        logger.debug(customer3);
        logger.debug("Checking the Customer 3 age (with AOP After Advise)...");
        customer3.checkAge();
        Customer customer4=(Customer) applicationContext.getBean("customerProxyBean3");
        logger.debug("Printing the Customer 4 details (with AOP After Throw Advise)...");
        logger.debug(customer4);
        logger.debug("Checking the Customer 4 age (with AOP After Throw Advise)...");
        try {
            customer4.checkAge();
        }catch (IllegalArgumentException e){
            logger.error("IllegalArgumentException Occurs. Age should be greater than 18");
        }
        Customer customer5=(Customer) applicationContext.getBean("customerProxyBean4");
        logger.debug("Printing the Customer 5 details (with AOP Around Advise)...");
        logger.debug(customer5);
        logger.debug("Checking the Customer 5 age (with AOP Around Advise)...");
        try {
            customer5.checkAge();
        }catch (IllegalArgumentException e){
            logger.error("IllegalArgumentException Occurs. Age should be greater than 18");
        }
    }
}
