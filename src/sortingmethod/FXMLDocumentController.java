/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingmethod;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 *
 * @author angel
 */
public class FXMLDocumentController implements Initializable {
    ObservableList<String> sortingMethods = 
            FXCollections.observableArrayList("Burbuja", "Insercion directa", "Insercion Binaria", "Seleccion", "Shell", "QuickSort");
    
    @FXML
    private Label label;
    
    @FXML
    private ChoiceBox sortBox;
    
    @FXML
    private TextField txtN;
    
    @FXML
    private Label lSalida;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        System.out.println(sortBox.getValue());
        String [] val=FinalProyect.getData(""+sortBox.getValue(),Integer.parseInt(txtN.getText()));
        System.out.println(Arrays.toString(val));
        lSalida.setText("El tiempo de ejecucion fue de "+val[0]+"\npara "+val[1]+" elementos");
        lSalida.setVisible(true);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        sortBox.setValue("Burbuja");
        sortBox.setItems(sortingMethods);
        
    }    
    
}
