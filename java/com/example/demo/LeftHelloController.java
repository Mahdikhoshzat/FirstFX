package com.example.demo;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class LeftHelloController {
    @FXML
    private Canvas canvas;

    @FXML
     void drawLines(ActionEvent event) {
        GraphicsContext myGraph=canvas.getGraphicsContext2D();
        double tool=canvas.getWidth();
        double arz=canvas.getHeight();
        for (int i = 0,j=0; j < 14; i+=25,arz-=25,j++) {
            myGraph.strokeLine(0,0,arz,i);
        }
        double tool1=canvas.getWidth();
        double arz1=canvas.getHeight();
        for (int j=0,i=0; j < 14; i+=25,arz1-=25,j++) {
            myGraph.strokeLine(canvas.getWidth(),canvas.getHeight(),arz1,i);
        }
        double tool2=canvas.getWidth();
        double arz2=canvas.getHeight();
        for (int i = 0,k=0,j=0; j < 14; i+=25,k+=25,j++) {
            myGraph.strokeLine(arz2,0,k,i);
        }
        double tool3=canvas.getWidth();
        double arz3=canvas.getHeight();
        for (int i = 0,k=0,j=0; j < 14; i+=25,k+=25,j++) {
            myGraph.strokeLine(0,tool3,k,i);
        }
    }
}