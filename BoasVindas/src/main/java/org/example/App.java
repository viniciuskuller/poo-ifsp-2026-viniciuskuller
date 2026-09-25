package org.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        VBox vBox = new VBox(15.0f);
        vBox.setPadding(new Insets(15.0f));
        Label labelNome = new Label("Nome: ");
        TextField tfNome = new TextField();
        Button botaoOk = new Button("OK");
        Label msg = new Label("Oi");

        vBox.getChildren().addAll(labelNome,tfNome,botaoOk, msg);
        Scene cena = new Scene(vBox, 320, 240);
        botaoOk.setOnAction(  e ->{
            msg.setText(tfNome.getText());

        });

        stage.setTitle(":: JABUFT ::");
        stage.setResizable(false);
        if(botaoOk.isPressed()){
            stage.centerOnScreen();
        }
        stage.setScene(cena);

        stage.show();

    }

    public static void main(String[] args) {

        launch();
    }

}