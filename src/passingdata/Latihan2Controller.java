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
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author firdahilya
 */
public class Latihan2Controller implements Initializable {

    @FXML
    private TableColumn<?, ?> nomer;
    @FXML
    private TableColumn<?, ?> kendaraan;
    @FXML
    private TableColumn<?, ?> parkir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void setData(String pn,String dara,String np){
    nomer.setText(pn);
    kendaraan.setText(dara);
    parkir.setText(np);
    }
       @FXML
    void metuuu(ActionEvent event) {
         System.exit(0);

    }
    
}
