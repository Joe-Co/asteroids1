package com.example.asteroids1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws IOException {
        Pane root = new Pane();
        BorderPane holder = new BorderPane();

        Canvas canvas = new Canvas();
        canvas.setWidth(400);
        canvas.setHeight(500);
        System.out.println(canvas.getWidth() + " by " + canvas.getHeight());
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        holder.getChildren().add(canvas);
//        holder.setCenter(canvas);
        root.getChildren().add(holder);
        holder.setStyle("-fx-background-color: green");
        holder.prefWidthProperty().bind(root.widthProperty());
        holder.prefHeightProperty().bind(root.heightProperty());
        Region top = new Region();
        top.setPrefWidth(holder.getWidth());
        top.setPrefHeight(20);
        Region bottom = new Region();
        Region left = new Region();
        Region right = new Region();
        right.setPrefWidth(20);
        right.setPrefHeight(holder.getHeight());
        holder.setTop(top);
        holder.setBottom(bottom);
        holder.setLeft(left);
        holder.setRight(right);

//        canvas.widthProperty().bind(holder.widthProperty());
        System.out.println(canvas.getWidth() + " by " + canvas.getHeight());
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();
        System.out.println(canvas.getWidth() + " by " + canvas.getHeight());
    }
    private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.setStroke(Color.BLUE);
        gc.fillRect(0, 0, 10000, 10000);
//        gc.setLineWidth(5);
//        gc.strokeLine(40, 10, 10, 40);
//        gc.fillOval(10, 60, 30, 30);
//        gc.strokeOval(60, 60, 30, 30);
//        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
//        gc.fillPolygon(new double[]{10, 40, 10, 40},
//                new double[]{210, 210, 240, 240}, 4);
//        gc.strokePolygon(new double[]{60, 90, 60, 90},
//                new double[]{210, 210, 240, 240}, 4);
//        gc.strokePolyline(new double[]{110, 140, 110, 140},
//                new double[]{210, 210, 240, 240}, 4);

    }

}