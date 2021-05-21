package edu.cs2430.assignment5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application
{
    private GUIController gameController;
    private final static int STAGE_HEIGHT = 500, STAGE_WIDTH = 500;

    @Override
    public void start(Stage primaryStage) throws IOException
    {
        Parent root = FXMLLoader.load(getClass()
           .getResource("GamePage.fxml"));
        final Scene primaryScene = new Scene(root,
           STAGE_WIDTH, STAGE_HEIGHT);
        primaryStage.setScene(primaryScene);
        primaryStage.setTitle("Black Jack");

        gameController = new GUIController();
        gameController.setUp();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
