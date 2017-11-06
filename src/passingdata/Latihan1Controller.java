/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passingdata;

import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author firdahilya
 */
public class Latihan1Controller implements Initializable {

    @FXML
    private Label label;
    @FXML
    private JFXTextField plat;
    @FXML
    private JFXTextField kendaraan;
    @FXML
    private JFXTextField harga;
    @FXML
    private Button masuk;
    @FXML
    private Button hapus;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void melbu(ActionEvent event) {
         String pn,kd,h;
            pn = this.plat.getText();
            kd = this.kendaraan.getText();
            h = this.harga.getText();
            
            
                    try{
                ((Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxml = new FXMLLoader(getClass().getResource("Latihan2.fxml"));
                Parent root = (Parent)fxml.load();
                Latihan2Controller controller = fxml.<Latihan2Controller>getController();
                controller.setData(pn,kd,h);
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Parkiran");
               
            stage.show();
            }catch(IOException e){
            System.out.println("Failed to create new window"+e);
            }
    }
    @FXML
    private void busek(ActionEvent event) {
         plat.setText("");
         kendaraan.setText("");
         harga.setText("");
          

    }
    
}
