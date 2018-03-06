/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static sun.security.krb5.KrbException.errorMessage;

/**
 *
 * @author Ankomah
 */
public class MathView extends javax.swing.JFrame {

    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);
    private ActionListener listnerForCalcButton;
    
    MathView(){
        JPanel calcPanel = new JPanel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        
        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
        
        this.add(calcPanel);
                
    }
     public int getFirstNumber (){
         return Integer.parseInt(firstNumber.getText());
         
     }
      
     public int getSecondNumber (){
         return Integer.parseInt(secondNumber.getText());
         
     }
      
     public int getCalcSolution (){
         return Integer.parseInt(calcSolution.getText());
         
     }
      public void setCalcSolution (int solution){
          calcSolution.setText(Integer.toString(solution));
          
      }
        
        
        void addCalculationListener(ActionListener listenerForCalcButton){
             calculateButton.addActionListener(listnerForCalcButton);
      }
        void displayErrorMessage(String errorMessage){
            JOptionPane.showMessageDialog(this, errorMessage);
}

    
}

          
      
   


          
      
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
