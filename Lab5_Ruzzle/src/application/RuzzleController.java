package application;

import java.net.URL;
import java.util.*;
import java.util.ResourceBundle;

import it.polito.tdp.ruzzle.model.ModelRuzzle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class RuzzleController {

	ModelRuzzle mr = new ModelRuzzle();
	
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnGenera;

    @FXML
    private TextArea txtParole;

    @FXML
    private Label Lab1;

    @FXML
    private Label Lab2;

    @FXML
    private Label Lab3;

    @FXML
    private Label Lab5;

    @FXML
    private Label Lab6;

    @FXML
    private Label Lab7;

    @FXML
    private Label Lab4;

    @FXML
    private Label Lab8;

    @FXML
    private Label Lab9;

    @FXML
    private Label Lab10;

    @FXML
    private Label Lab11;

    @FXML
    private Label Lab12;

    @FXML
    private Label Lab13;

    @FXML
    private Label Lab14;

    @FXML
    private Label Lab15;

    @FXML
    private Label Lab16;

    @FXML
    void doGenera(ActionEvent event) {
    	Label[] labArray= new Label[]{Lab1, Lab2, Lab3, Lab4, Lab5, Lab6, Lab7, Lab8, Lab9, Lab10, Lab11, Lab12, Lab13, Lab14, Lab15, Lab16 };
    	
    	String s=String.copyValueOf(mr.generazione());
		
    	for( int i = 0; i< labArray.length ; i++){
    		
    		
    		
    		labArray[i].setText(""+s.charAt(i));
    	
    		
    	}
    	
    	
		//txtParole.setText(parole.toString());
    	
    }

    @FXML
    void initialize() {
        assert btnGenera != null : "fx:id=\"btnGenera\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert txtParole != null : "fx:id=\"txtParole\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert Lab1 != null : "fx:id=\"Lab1\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert Lab2 != null : "fx:id=\"Lab2\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert Lab3 != null : "fx:id=\"Lab3\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert Lab5 != null : "fx:id=\"Lab5\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert Lab6 != null : "fx:id=\"Lab6\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert Lab7 != null : "fx:id=\"Lab7\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert Lab4 != null : "fx:id=\"Lab4\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert Lab8 != null : "fx:id=\"Lab8\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert Lab9 != null : "fx:id=\"Lab9\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert Lab10 != null : "fx:id=\"Lab10\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert Lab11 != null : "fx:id=\"Lab11\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert Lab12 != null : "fx:id=\"Lab12\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert Lab13 != null : "fx:id=\"Lab13\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert Lab14 != null : "fx:id=\"Lab14\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert Lab15 != null : "fx:id=\"Lab15\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert Lab16 != null : "fx:id=\"Lab16\" was not injected: check your FXML file 'Ruzzle.fxml'.";
    }
}
