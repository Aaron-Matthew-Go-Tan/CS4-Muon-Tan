/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise13muontanaaronmatthew;

/**
 *
 * @author MUON
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

/**
 *
 * @author Lauan 03
 */
public class DisplayController implements Initializable {
    
    @FXML TextField input;
    @FXML ImageView image;
    @FXML Text name, units, grade;
    @FXML Button search, previous, next;
    
    @FXML private void previousSubject(){
        try{
            image.setText(String.format("This account belongs to %s.", user.getFname()));
            name.setText(getName());
            units.setText(getUnits());
            grade.setText(getGrade());
        }
        catch(NullPointerException e){
            info.setText("Invalid login");
            info.setFill(Color.RED);
        }
        
        if (active.getSubjectIndex)
    }
    
    @FXML private void nextSubject(){
        try{
            image.setText(String.format("This account belongs to %s.", user.getFname()));
            name.setText(getName());
            units.setText(getUnits());
            grade.setText(getGrade());
        }
        catch(NullPointerException e){
            info.setText("Invalid login");
            info.setFill(Color.RED);
        }
    }
    
    @FXML private void enterLogin(KeyEvent event){
        if(event.getCode().equals(KeyCode.ENTER)){
            attemptLogin();
        }
    }
    
    @FXML private void checkLength(KeyEvent event){
        TextField source = (TextField) event.getSource();
        if(source.getText().length() > 10){
            String alt = "";
            if(event.getSource() == username) alt = "Username";
            if(event.getSource() == password) alt = "Password";
            info.setText(String.format("%s input is too long!", alt));
            info.setFill(Color.ORANGERED);
        }
        else{
            info.setText("");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        username.setText(Account.getLatest().getUsername());
    }    
    
}
