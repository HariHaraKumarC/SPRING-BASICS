package hari.edu.spring.jdbc;

import hari.edu.spring.pojo.Book;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class BookPreparedStatementDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean insertBook(Book book){
        String query="INSERT INTO BOOK" + "(ID,AUTHOR_ID,LANGUAGE_CODE,NAME) VALUES (?,?,?,?)";
        PreparedStatementCallback<Boolean> preparedStatementCallback= preparedStatement -> {
            preparedStatement.setInt(1,book.getId());
            preparedStatement.setInt(2,book.getAuthorId());
            preparedStatement.setInt(3,book.getLanguageId());
            preparedStatement.setString(4,book.getName());
            return preparedStatement.execute();
        };
        return jdbcTemplate.execute(query,preparedStatementCallback);
    }

    public boolean updateBook(Book book){
        String query="UPDATE BOOK SET AUTHOR_ID = ? , LANGUAGE_CODE = ? , NAME = ?  WHERE ID = ?";
        PreparedStatementCallback<Boolean> preparedStatementCallback= preparedStatement -> {
            preparedStatement.setInt(1,book.getAuthorId());
            preparedStatement.setInt(2,book.getLanguageId());
            preparedStatement.setString(3,book.getName());
            preparedStatement.setInt(4,book.getId());
            return preparedStatement.execute();
        };
        return jdbcTemplate.execute(query,preparedStatementCallback);
    }

    public boolean deleteBook(Book book){
        String query="DELETE FROM BOOK WHERE ID = ? ";
        PreparedStatementCallback<Boolean> preparedStatementCallback= preparedStatement -> {
            preparedStatement.setInt(1,book.getId());
            return preparedStatement.execute();
        };
        return jdbcTemplate.execute(query,preparedStatementCallback);
    }
}
