package hari.edu.spring.app;

import hari.edu.spring.jdbc.BookPreparedStatementDao;
import hari.edu.spring.pojo.Book;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJdbcPreparedStatementExample {

    public static final String SPRING_APPLICATION_CONTEXT_FILE= "springJdbcAppContext.xml";
    private static final Logger logger=Logger.getLogger(SpringJdbcPreparedStatementExample.class);

    public static void main(String[] args) {
        logger.debug("Loading Bean Info from Spring Config File : "+ SPRING_APPLICATION_CONTEXT_FILE);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(SPRING_APPLICATION_CONTEXT_FILE); //spring-context-support dependency
        BookPreparedStatementDao bookPreparedStatementDao=(BookPreparedStatementDao) applicationContext.getBean("bookPreparedStatementDao");
        Book book5=(Book) applicationContext.getBean("book5");
        /*logger.debug("Inserting Book into the Database");
        boolean status=bookPreparedStatementDao.insertBook(book5);
        logger.debug("Inserting Book Transaction Completed. Status Code : "+status);*/
        /*logger.debug("Updating the Book 5 Name in the Database");       book5.setName("Ponniyin Selvan");
        boolean status=bookPreparedStatementDao.updateBook(book5);
        logger.debug("Updating Book Transaction Completed. Status Code : "+status);*/
        logger.debug("Deleting the Book 5 Name from the Database");
        boolean status=bookPreparedStatementDao.deleteBook(book5);
        logger.debug("Delete Book Transaction Completed. Status Code : "+status);
    }
}
