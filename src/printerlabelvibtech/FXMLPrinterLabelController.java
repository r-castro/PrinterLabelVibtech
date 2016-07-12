/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printerlabelvibtech;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 *
 * @author Rodrigo
 */
public class FXMLPrinterLabelController implements Initializable {
    
    @FXML
    private Button buttonSair;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        buttonSair.setOnAction(e -> {
            Platform.exit();
            System.out.println("Teste");
        });
    }    
    
}
