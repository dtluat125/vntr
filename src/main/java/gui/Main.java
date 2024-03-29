package gui;

import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("scenedemo.fxml"));
            Scene scene = new Scene(root, Color.LIGHTSKYBLUE);
            String css = this.getClass().getResource("application.css").toExternalForm();

            scene.getStylesheets().add(css);
            stage.setScene(scene);
            Image icon = new Image("file:logo.jpg");
            File file = new File("");
            System.out.println(file.getAbsolutePath());

            stage.setTitle("Stage demo program");
            stage.getIcons().add(icon);
            stage.show();
            stage.setResizable(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

}