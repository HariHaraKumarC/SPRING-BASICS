package hari.edu.spring.app;

import hari.edu.spring.pojo.Customer;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPAspectJAnnotationExample {

    public static final String SPRING_APPLICATION_CONTEXT_FILE= "springAspectjAnnotationAppContext.xml";
    private static final Logger logger=Logger.getLogger(AOPAspectJAnnotationExample.class);

    public static void main(String[] args) {
        logger.debug("Loading Bean Info from Spring Config File : "+ SPRING_APPLICATION_CONTEXT_FILE);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(SPRING_APPLICATION_CONTEXT_FILE); //spring-context-support dependency
        Customer customer12=(Customer) applicationContext.getBean("customerBean12");
        logger.debug("Printing the Customer 12 details");
        logger.debug(customer12);
        logger.debug("Setting the new name for Customer 12 (with AOP Before Advise - Aspect 4J Annotation)...");
        customer12.setName("Senthil Kumar");
        logger.debug("Setting the new age for Customer 12 (with AOP After Advise - Aspect 4J Annotation)...");
        customer12.setAge(5);
        logger.debug("Printing the new age for Customer 12 (with AOP After Return Advise - Aspect 4J Annotation)..."+customer12.getAge());
        logger.debug("Checking the age validity for Customer 12 (with AOP After Throw Advise - Aspect 4J Annotation)...");
        try{
            customer12.checkAge();
        }catch(IllegalArgumentException e ){
            logger.error("Error Occurred" + e);
        }
        logger.debug("Printing the new name for Customer 12 (with AOP Around Advise - Aspect 4J Annotation)..."+customer12.getName());
    }
}
