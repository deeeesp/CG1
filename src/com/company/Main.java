package com.company;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Circle circle = new Circle();
        circle.setCenterX(500.0f);
        circle.setCenterY(300.0f);
        circle.setRadius(200.0f);
        circle.setStroke(Color.ORCHID);
        circle.setFill(Color.GOLD);

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(300);
        rectangle.setWidth(200);
        rectangle.setX(50);
        rectangle.setY(50);
        rectangle.setStroke(Color.GOLD);
        rectangle.setFill(Color.NAVY);

        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(700.0f);
        ellipse.setCenterY(700.0f);
        ellipse.setRadiusX(100.0f);
        ellipse.setRadiusY(150.0f);
        ellipse.setStroke(Color.PURPLE);
        ellipse.setFill(Color.YELLOW);

        Line line = new Line();
        line.setStartX(930.0);
        line.setStartY(350.0);
        line.setEndX(1000.0);
        line.setEndY(880.0);
        line.setStroke(Color.GREEN);

        Text text = new Text(".");
        text.setX(1000);
        text.setY(100);
        text.setFill(Color.BLACK);

        Group root = new Group(circle, ellipse, line, text, rectangle);

        Scene scene = new Scene(root, 1200, 900);
        stage.setTitle("Hello");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}