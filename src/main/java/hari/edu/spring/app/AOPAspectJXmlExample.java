package hari.edu.spring.app;

import hari.edu.spring.pojo.Customer;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPAspectJXmlExample {

    public static final String SPRING_APPLICATION_CONTEXT_FILE= "springAspectjAppContext.xml";
    private static final Logger logger=Logger.getLogger(AOPAspectJXmlExample.class);

    public static void main(String[] args) {
        logger.debug("Loading Bean Info from Spring Config File : "+ SPRING_APPLICATION_CONTEXT_FILE);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(SPRING_APPLICATION_CONTEXT_FILE); //spring-context-support dependency
        Customer customer7=(Customer) applicationContext.getBean("customerBean7");
        logger.debug("Printing the Customer 7 details (with AOP Before Advise - Aspect 4J Xml)...");
        logger.debug(customer7);
        logger.debug("Checking the Customer 7 age (with AOP Before Advise - Aspect 4J Xml)...");
        customer7.checkAge();
        Customer customer8=(Customer) applicationContext.getBean("customerBean8");
        logger.debug("Printing the Customer 8 details (with AOP After Advise - Aspect 4J Xml)...");
        logger.debug(customer8);
        logger.debug("Checking the Customer 8 age (with AOP After Advise - Aspect 4J Xml)...");
        customer8.checkAge();
        Customer customer9=(Customer) applicationContext.getBean("customerBean9");
        logger.debug("Printing the Customer 9 details (with AOP After Return Advise - Aspect 4J Xml)...");
        logger.debug(customer9);
        logger.debug("Printing the Customer 9 age (with AOP After Return Advise - Aspect 4J Xml)..." + customer9.getAge());
        Customer customer10=(Customer) applicationContext.getBean("customerBean10");
        logger.debug("Printing the Customer 10 details (with AOP After Throw Advise - Aspect 4J Xml)...");
        logger.debug(customer10);
        logger.debug("Checking the Customer 10 age (with AOP After Throw Advise - Aspect 4J Xml)..." );
        try {
            customer10.checkAge();
        }catch (IllegalArgumentException e){
            logger.error("Error occurred... "+ e);
        }
        Customer customer11=(Customer) applicationContext.getBean("customerBean11");
        logger.debug("Printing the Customer 11 details (with AOP Around Advise - Aspect 4J Xml)...");
        logger.debug(customer11);
        customer11.setAge(31);
        logger.debug("Printing the new age of the Customer 11(with AOP Around Advise - Aspect 4J Xml)..." + customer11.getAge());
    }
}
