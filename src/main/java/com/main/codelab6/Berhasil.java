package com.main.codelab6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Berhasil extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setPrefSize(600, 400);

        // Column constraints
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPrefWidth(100);
        col1.setMinWidth(10);
        col1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        gridPane.getColumnConstraints().add(col1);

        // Row constraints
        RowConstraints row1 = new RowConstraints();
        row1.setPrefHeight(30);
        row1.setMinHeight(10);
        row1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        RowConstraints row2 = new RowConstraints();
        row2.setPrefHeight(30);
        row2.setMinHeight(10);
        row2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        RowConstraints row3 = new RowConstraints();
        row3.setPrefHeight(30);
        row3.setMinHeight(10);
        row3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        gridPane.getRowConstraints().addAll(row1, row2, row3);

        // VBox
        VBox vbox = new VBox();
        vbox.setAlignment(javafx.geometry.Pos.CENTER);
        vbox.setPrefSize(100, 200);
        GridPane.setRowIndex(vbox, 1);

        // Label
        Label label = new Label("BERHASIL LOGIN!");
        label.setFont(new Font(36));
        vbox.getChildren().add(label);

        gridPane.getChildren().add(vbox);

        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FXML to JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
