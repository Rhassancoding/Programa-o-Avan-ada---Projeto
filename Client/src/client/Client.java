/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import client.GameQuiz;

public class Client extends Application {
    
   

   
    public static void main(String[] args) {
   GameQuiz gameQuiz= new GameQuiz();
   Comand abrirComand =new AbrirComand(gameQuiz);
   Comand fecharComand= new FecharComand(gameQuiz);
      Controle controle =new Controle(abrirComand, fecharComand);
      controle.abrirComand();
      controle.fecharComand();
      //  launch(args);
       
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
      
    }
     
     
}
