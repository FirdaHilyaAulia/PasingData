/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passingdata;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author firdahilya
 */
public class Latihan2Controller implements Initializable {

    @FXML
    private TableColumn<?, ?> PlatNomorr;
    @FXML
    private TableColumn<?, ?> Kendaraaan;
    @FXML
    private TableColumn<?, ?> HrgaP;
    @FXML
    private Button metuu;
    @FXML
    private Label nomer;
    @FXML
    private Label kendaraan;
    @FXML
    private Label parkir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void metuuu(ActionEvent event) {
        System.exit(0);
    }

    void setData(String pn, String dara, String np) {
    nomer.setText(pn);
    kendaraan.setText(dara);
    parkir.setText(np); //To change body of generated methods, choose Tools | Templates.
    }
    
}
