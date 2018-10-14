package hari.edu.spring.app;

import hari.edu.spring.pojo.Mobile;
import hari.edu.spring.pojo.Printer;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMethodDIExample {

    public static final String SPRING_APPLICATION_CONTEXT_FILE="applicationContext.xml";
    private static final Logger logger=Logger.getLogger(FactoryMethodDIExample.class);

    public static void main(String[] args) {
        logger.debug("Loading Bean Info from Spring Config File : "+ SPRING_APPLICATION_CONTEXT_FILE);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(SPRING_APPLICATION_CONTEXT_FILE); //spring-context-support dependency
        Mobile mobile=(Mobile) applicationContext.getBean("mobileBean1");
        logger.debug("Printing the Singleton Class Mobile details...");
        logger.debug(mobile);
        Printer printer1=(Printer)applicationContext.getBean("staticPrintFactoryBean");
        logger.debug("Printing the Message using Static PrintFactory Method...");
        printer1.write();
        Printer printer2=(Printer)applicationContext.getBean("printerBean");
        logger.debug("Printing the Message using Non Static PrintFactory Method...");
        printer2.write();
    }
}
