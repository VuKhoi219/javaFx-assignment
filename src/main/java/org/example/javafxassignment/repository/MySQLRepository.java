package org.example.javafxassignment.repository;

import org.example.javafxassignment.entity.Article;

import java.sql.*;
import java.util.ArrayList;

public class MySQLRepository {
    private final String MYSQL_CONNECTION_STRING = "jdbc:mysql://localhost:3306/article";
    private final String MYSQL_USERNAME = "root";
    private final String MYSQL_PASSWORD = "";

    public void save(Article obj){
        try {
            Connection connection = DriverManager.getConnection(MYSQL_CONNECTION_STRING, MYSQL_USERNAME, MYSQL_PASSWORD);
            String strSql = "insert into new_articles_1 (title, describes, content,status) values (?, ?, ?,1)";
            PreparedStatement preparedStatement = connection.prepareStatement(strSql);
            preparedStatement.setString(1, obj.getTitle());
            preparedStatement.setString(2, obj.getDes());
            preparedStatement.setString(3, obj.getContainer());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Article> findAll(){
        ArrayList<Article> articles = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(MYSQL_CONNECTION_STRING, MYSQL_USERNAME, MYSQL_PASSWORD);
            String prSql = "select id ,title,describes,content from new_articles_1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(prSql);
            while (resultSet.next()) {
                Article obj = new Article();
                obj.setId(resultSet.getLong("id"));
                obj.setTitle(resultSet.getString("title"));
                obj.setDes(resultSet.getString("describes"));
                obj.setContainer(resultSet.getString("content"));
                articles.add(obj);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return articles;
    }

}
