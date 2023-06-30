package com.example.trabalho_poo_javafx;

//import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        /*URL fxmlLocation = getClass().getResource("LoginView.fxml");
        FXMLLoader loader = new FXMLLoader(fxmlLocation);*/


        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("LoginView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {

        launch();
    }
}