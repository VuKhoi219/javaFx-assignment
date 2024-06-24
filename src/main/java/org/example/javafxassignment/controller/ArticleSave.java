package org.example.javafxassignment.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import org.example.javafxassignment.entity.Article;
import org.example.javafxassignment.repository.MySQLRepository;

public class ArticleSave {
    public TextField title;
    public TextField des;
    public TextField container;
    MySQLRepository mySQLRepository = new MySQLRepository();
    public void save(ActionEvent actionEvent) {
        Article article = new Article();
        article.setTitle(title.getText());
        article.setDes(des.getText());
        article.setContainer(container.getText());
        mySQLRepository.save(article);
    }
}
