/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Ankomah
 */
public class MathController {
    
    private MathView theView;
    private MathModel theModel;
    
    public MathController(MathView theview, MathModel theModel){
        
        this.theView = theView;
        this.theModel = theModel;
        
        this.theView.addCalculationListener(new CalculateListener());
    }
    
    class CalculateListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            int firstNumber, secondNumber = 0;
            
            try{
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                
                theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getCalcutionValue());
                
            }
            catch(NumberFormatException ex){
                theView.displayErrorMessage("Enter Two Numbers");
            }
        }
        
    }
  
    
    
}
