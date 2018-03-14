/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import GUI.Add;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextField;

/** 
 * @author Paul Andre Francisco
 */
public class Utilities {
    
    public Utilities(){
        
    }
    
    public void clearFields(JPanel panel, JComboBox combo){
        Component[] children = panel.getComponents();
        for(int i = 0; i <children.length; i++){
//            System.out.println(children[i].getClass() + "\n");
            if (children[i] instanceof JTextField){        
                ((JTextField)children[i]).setText("");
            }
            
            combo.setSelectedItem("Select Transaction");
        }
    }
    
    public void validateBigDecimal(String fieldValue, JTextField field)
    {        
        String regex = "^[0-9.]+$";        
        
        if(fieldValue.matches(regex) == false && fieldValue.length() > 0){
            JOptionPane.showMessageDialog(null, "Character not allowed");
            field.setText("");
        }
    }
    
    public void validateInt(String fieldValue, JTextField field)
    {
        String regex = "^[0-9+]+$";
        if(fieldValue.matches(regex) == false && fieldValue.length() > 0){
            JOptionPane.showMessageDialog(null, "Only number and '+' are allowed");
            field.setText("");
        }
    }
    
    public void placeHolders(String message, JTextField element){

        element.setText(message);
        element.setForeground(Color.GRAY);
        element.addFocusListener(new FocusListener() {
        @Override
        public void focusGained(FocusEvent e) {
            if (element.getText().equals(message)) {
                element.setText("");
                element.setForeground(Color.BLACK);
            }
        }
        @Override
        public void focusLost(FocusEvent e) {
            if (element.getText().isEmpty()) {
                element.setForeground(Color.GRAY);
                element.setText(message);
            }
        }
        });
    }  
}
