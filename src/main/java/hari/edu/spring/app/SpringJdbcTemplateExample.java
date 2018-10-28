package hari.edu.spring.app;

import hari.edu.spring.jdbc.BookDao;
import hari.edu.spring.pojo.Book;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJdbcTemplateExample {

    public static final String SPRING_APPLICATION_CONTEXT_FILE= "springJdbcAppContext.xml";
    private static final Logger logger=Logger.getLogger(SpringJdbcTemplateExample.class);

    public static void main(String[] args) {
        logger.debug("Loading Bean Info from Spring Config File : "+ SPRING_APPLICATION_CONTEXT_FILE);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(SPRING_APPLICATION_CONTEXT_FILE); //spring-context-support dependency
        BookDao bookDao=(BookDao) applicationContext.getBean("bookDao");
        Book book4=(Book) applicationContext.getBean("book4");
        /*logger.debug("Inserting Book into the Database");
        int status=bookDao.insertBook(book4);
        logger.debug("Inserting Book Transaction Completed. Status Code : "+status);*/
        /*logger.debug("Updating the Book 4 Name in the Database");
        book4.setName("Ponniyin Selvan");
        book4.setAuthorId(2);
        int status=bookDao.updateBook(book4);
        logger.debug("Updating Book Transaction Completed. Status Code : "+status);*/
        logger.debug("Deleting the Book 4 Name from the Database");
        int status=bookDao.deleteBook(book4);
        logger.debug("Delete Book Transaction Completed. Status Code : "+status);
    }
}
