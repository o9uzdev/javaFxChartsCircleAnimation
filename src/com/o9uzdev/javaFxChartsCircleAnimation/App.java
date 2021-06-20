package com.o9uzdev.javaFxChartsCircleAnimation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        Circle circle = new Circle(100, 100, 50);
        circle.setFill(Color.BLUEVIOLET);
        circle.setFocusTraversable(true);
        //when focusTraversable property is true focus can be moved to circle

        circle.setOnMouseClicked(event -> circle.requestFocus());
        circle.setOnMouseDragged(e -> {
            circle.setCenterX(e.getX());
            circle.setCenterY(e.getY());
        });

        circle.setOnMouseClicked(event -> circle.requestFocus());
        circle.setOnMouseDragged(e -> {
            circle.setCenterX(e.getX());
            circle.setCenterY(e.getY());
        });

        circle.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN:
                    circle.setCenterY(circle.getCenterY() + 10);
                    break;
                case UP:
                    circle.setCenterY(circle.getCenterY() - 10);
                    break;
                case LEFT:
                    circle.setCenterX(circle.getCenterX() - 10);
                    break;
                case RIGHT:
                    circle.setCenterX(circle.getCenterX() + 10);
                    break;
            }
        });

        pane.getChildren().addAll(circle);

        stage.setScene(new Scene(pane, 640, 480));
        stage.setTitle("JavaFx Charts Circle Animation");
        stage.show();
    }
}
