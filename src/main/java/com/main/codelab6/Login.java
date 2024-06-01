package com.main.codelab6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Login extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setPrefSize(600, 400);

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPrefWidth(186);
        col1.setMinWidth(10);
        col1.setMaxWidth(293.333);
        col1.setHgrow(Priority.SOMETIMES);

        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPrefWidth(414);
        col2.setMinWidth(10);
        col2.setMaxWidth(423.333);
        col2.setHgrow(Priority.SOMETIMES);

        gridPane.getColumnConstraints().addAll(col1, col2);

        RowConstraints row1 = new RowConstraints();
        row1.setPrefHeight(86.666);
        row1.setMinHeight(10);
        row1.setMaxHeight(131.333);
        row1.setVgrow(Priority.SOMETIMES);

        RowConstraints row2 = new RowConstraints();
        row2.setPrefHeight(161.333);
        row2.setMinHeight(10);
        row2.setMaxHeight(250.666);
        row2.setVgrow(Priority.SOMETIMES);

        RowConstraints row3 = new RowConstraints();
        row3.setPrefHeight(153);
        row3.setMinHeight(10);
        row3.setMaxHeight(153);
        row3.setVgrow(Priority.SOMETIMES);

        gridPane.getRowConstraints().addAll(row1, row2, row3);

        VBox vbox1 = new VBox();
        vbox1.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        vbox1.setPrefHeight(133);
        GridPane.setRowIndex(vbox1, 1);

        Label usernameLabel = new Label("Username");
        usernameLabel.setFont(new Font(24));
        VBox.setMargin(usernameLabel, new Insets(0, 0, 30, 0));

        Label passwordLabel = new Label("Password");
        passwordLabel.setFont(new Font(24));

        vbox1.getChildren().addAll(usernameLabel, passwordLabel);
        GridPane.setMargin(vbox1, new Insets(0, 30, 0, 0));

        VBox vbox2 = new VBox();
        vbox2.setAlignment(javafx.geometry.Pos.CENTER);
        vbox2.setPrefSize(100, 200);
        GridPane.setColumnIndex(vbox2, 1);
        GridPane.setRowIndex(vbox2, 1);

        TextField usernameField = new TextField();
        usernameField.setPrefSize(314, 39);
        usernameField.setFont(new Font(14));
        VBox.setMargin(usernameField, new Insets(0, 0, 30, 0));

        TextField passwordField = new TextField();
        passwordField.setPrefSize(314, 39);
        passwordField.setFont(new Font(14));

        vbox2.getChildren().addAll(usernameField, passwordField);
        GridPane.setMargin(vbox2, new Insets(0, 100, 0, 0));

        VBox vbox3 = new VBox();
        vbox3.setAlignment(javafx.geometry.Pos.TOP_RIGHT);
        vbox3.setPrefSize(100, 200);
        GridPane.setColumnIndex(vbox3, 1);
        GridPane.setRowIndex(vbox3, 2);
        GridPane.setMargin(vbox3, new Insets(0, 100, 0, 0));

        Button loginButton = new Button("Login");
        loginButton.setPrefSize(191, 57);
        loginButton.setFont(new Font(24));
        VBox.setMargin(loginButton, new Insets(0, 160, 0, 0));

        Label errorMessage = new Label();
        errorMessage.setPrefSize(357, 27);
        errorMessage.setFont(new Font(18));
        errorMessage.setTextFill(javafx.scene.paint.Color.RED);
        VBox.setMargin(errorMessage, new Insets(20, 50, 0, 0));

        vbox3.getChildren().addAll(loginButton, errorMessage);
        GridPane.setMargin(vbox3, new Insets(0, 100, 0, 0));

        VBox vbox4 = new VBox();
        vbox4.setPrefSize(100, 200);
        GridPane.setColumnIndex(vbox4, 1);

        Label adminLoginLabel = new Label("ADMIN LOGIN");
        adminLoginLabel.setFont(new Font("System Bold", 36));
        VBox.setMargin(adminLoginLabel, new Insets(0, 0, 50, 0));

        loginButton.setOnAction(actionEvent -> {
            String username = usernameField.getText().trim();
            String password = passwordField.getText().trim();
            if(username.isEmpty() || password.isEmpty()) {
                errorMessage.setText("Username or password empty.");
            }else {
                if(username.equals("admin") && password.equals("admin")) {
                    Berhasil berhasil = new Berhasil();
                    berhasil.start(primaryStage);
                }else {
                    errorMessage.setText("Username or password wrong.");
                }
            }
        });

        vbox4.getChildren().add(adminLoginLabel);
        GridPane.setMargin(vbox4, new Insets(30, 0, 0, 0));

        gridPane.getChildren().addAll(vbox1, vbox2, vbox3, vbox4);

        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FXML to JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
