package hari.edu.spring.jdbc;

import hari.edu.spring.pojo.Book;
import org.springframework.jdbc.core.JdbcTemplate;

public class BookDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insertBook(Book book){
        String query="INSERT INTO BOOK" + "(ID,AUTHOR_ID,LANGUAGE_CODE,NAME) VALUES ('"+
                book.getId()+"','"+
                book.getAuthorId()+"','"+
                book.getLanguageId()+"','"+
                book.getName()+"')";
        return jdbcTemplate.update(query);
    }

    public int updateBook(Book book){
        String query="UPDATE BOOK SET AUTHOR_ID = "+
                book.getAuthorId()+", LANGUAGE_CODE = "+
                book.getLanguageId()+", NAME = '"+
                book.getName()+"' WHERE ID = '"+
                book.getId()+"'";
        return jdbcTemplate.update(query);
    }

    public int deleteBook(Book book){
        String query="DELETE FROM BOOK WHERE ID = "+
                book.getId();
        return jdbcTemplate.update(query);
    }
}
