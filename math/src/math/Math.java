/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

/**
 *
 * @author Ankomah
 */
public class Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MathView theView = new MathView();
        MathModel theModel = new MathModel();
        MathController theController = new MathController(theView, theModel);
        
        theView.setVisible(true);
    }
    
}
