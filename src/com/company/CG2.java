package com.company;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class CG2 extends Application {
    @Override
    public void start(Stage stage) {
        //Creating a Polygon
        Polygon polygon = new Polygon();
        set(polygon);
        polygon.setTranslateY(-200);
        polygon.setTranslateX(-300);
        Polygon polygon1 = new Polygon();
        set(polygon1);
        polygon1.setScaleX(2.5);
        polygon1.setTranslateY(-200);
        polygon1.setTranslateX(300);

        Polygon polygon2 = new Polygon();
        set(polygon2);
        polygon2.setScaleY(2.5);
        polygon2.setTranslateY(300);
        polygon2.setTranslateX(-250);

        Polygon polygon3 = new Polygon();
        set(polygon3);
        polygon3.setRotate(45);
        polygon3.setTranslateY(300);
        polygon3.setTranslateX(300);

        //polygon.setTranslateX(0);

        //Creating a Group object
        Group root = new Group(polygon,polygon1,polygon2,polygon3);

        //Creating a scene object
        Scene scene = new Scene(root, 1200, 900);

        //Setting title to the Stage
        stage.setTitle("Drawing a Polygon");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }

    public void set(Polygon polygon){
        polygon.getPoints().addAll(new Double[]{
                500.0, 250.0,
                650.0, 350.0,
                500.0, 450.0,
                350.0, 350.0,
        });
        polygon.setStroke(Color.PURPLE);
        polygon.setFill(Color.WHITE);
    }
}