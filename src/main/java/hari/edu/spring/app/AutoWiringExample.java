package hari.edu.spring.app;

import hari.edu.spring.pojo.Author;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringExample {
    public static final String SPRING_APPLICATION_CONTEXT_FILE="applicationContext.xml";
    private static final Logger logger=Logger.getLogger(CICollectionExample.class);

    public static void main(String[] args) {
        logger.debug("Loading Bean Info from Spring Config File : "+ SPRING_APPLICATION_CONTEXT_FILE);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(SPRING_APPLICATION_CONTEXT_FILE); //spring-context-support dependency
        logger.debug("Autowiring Example : Author Info");
        Author author=(Author) applicationContext.getBean("authorBean");
        logger.debug("Author name > "+author.getName());
        author.getBooks().forEach(book -> logger.debug("Book Name : "+book.getName()));
    }
}
