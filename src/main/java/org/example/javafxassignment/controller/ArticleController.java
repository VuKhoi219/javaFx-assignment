package org.example.javafxassignment.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import org.example.javafxassignment.entity.Article;
import org.example.javafxassignment.repository.MySQLRepository;

import java.net.URL;
import java.util.ResourceBundle;

public class ArticleController implements Initializable {
    public TableView<Article> tableView;


    private MySQLRepository mySQLRepository = new MySQLRepository();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Article> data = FXCollections.observableArrayList(mySQLRepository.findAll());
        tableView.setItems(data);
    }

}
