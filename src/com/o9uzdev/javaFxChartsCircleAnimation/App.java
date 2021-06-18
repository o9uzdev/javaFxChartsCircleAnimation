package com.o9uzdev.javaFxChartsCircleAnimation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        Circle circle = new Circle(100,100,50);

        pane.getChildren().addAll(circle);

        stage.setScene(new Scene(pane,640,480));
        stage.setTitle("JavaFx Charts Circle Animation");
        stage.show();
    }
}
