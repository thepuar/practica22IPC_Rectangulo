/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica22cajaresize;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;

/**
 *
 * @author frapecha
 */
public class Practica22CajaResize extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Rectangle r = new Rectangle(100, 100);
        StackPane p = new StackPane();
        p.setPrefWidth(200);
        p.setPrefHeight(200);
        p.getChildren().add(r);
        p.widthProperty().addListener(
                (observable, oldvalue, newvalue)
                -> r.setWidth((Double) newvalue / 2)
        );
        p.heightProperty().addListener(
                (observable, oldvalue, newvalue)
                -> r.setHeight((Double) newvalue / 2)
        );
        Scene scene = new Scene(p);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Auto Rectangle");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
