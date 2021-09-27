package com.company;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.concurrent.TimeoutException;

public class Main extends Application {
    @Override
    public void start(Stage stage) {

        Circle circle = new Circle();
        circle.setCenterX(500.0f);
        circle.setCenterY(300.0f);
        circle.setRadius(200.0f);

        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(700.0f);
        ellipse.setCenterY(700.0f);
        ellipse.setRadiusX(100.0f);
        ellipse.setRadiusY(150.0f);

        Line line = new Line();
        line.setStartX(230.0);
        line.setStartY(650.0);
        line.setEndX(500.0);
        line.setEndY(580.0);

        Text text = new Text(".");
        text.setX(1000);
        text.setY(100);
        

        Group root = new Group(circle,ellipse,line,text);

        Scene scene = new Scene(root, 1200, 900);
        stage.setTitle("Hello");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}