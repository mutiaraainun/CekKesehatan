/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Mutiara
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private RadioButton L;
    @FXML
    private ToggleGroup pilihan;
    @FXML
    private RadioButton P;
    @FXML
    private Button buttonok;
    @FXML
    private Button buttonreset;
    @FXML
    private JFXTextField nama;
    @FXML
    private JFXTextField bb;
    @FXML
    private JFXTextField tb;
    @FXML
    private JFXTextField ideal;
    @FXML
    private JFXTextArea hasil;
    @FXML
    private JFXTextArea saran;
    
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        String Nama = nama.getText();
        int BB = Integer.parseInt(bb.getText());
        int TB = Integer.parseInt(tb.getText());
        String kelamin;
        int editideal = 0;
        String edithasil = null;
        String editsaran = null;
        if(L.isSelected())
            kelamin = "Laki-Laki";
        else if(P.isSelected())
            kelamin = "Perempuan";
        else
            kelamin = " ";
        
        if(L.isSelected())
            editideal = TB -110;
        else if(P.isSelected())
            editideal = TB -100;
        if( BB ==editideal){
            edithasil = "ideal";
            editsaran = "badan anda bagus";
        }else if ( BB >=editideal){
            edithasil ="gemuk";
            editsaran =" kurangi makan anda,karena kegemukan";
            
        }else if ( BB <=editideal){
            edithasil ="kurus";
            editsaran = "tambahi makan anda,karena kekurusan";
        }
        
        
        hasil.setText("Nama = "+Nama+"\nBerat Badan= "+BB+"\nTinggi Badan = "+TB+"\nJenis kelamin = "+kelamin+"\n");
        ideal.setText(""+editideal);
        saran.setText("saran = "+editsaran);
    }

    @FXML
    private void hapus(ActionEvent event) {
       hasil.setText("");
       nama.setText("");
       bb.setText("");
       tb.setText("");
       ideal.setText("");
       L.setSelected(false);
       P.setSelected(false);
       saran.setText("");
    }

    @FXML
    private void action_l(ActionEvent event) {
    
        
    }

    @FXML
    private void action_p(ActionEvent event) {
    
    }
    
}
