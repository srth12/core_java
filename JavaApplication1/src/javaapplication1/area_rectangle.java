/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import javax.swing.JOptionPane;

/**
 *
 * @author srth12
 */
public class area_rectangle {
    public static void  sample(){
    String length= JOptionPane.showInputDialog("EntER LENGTH","0");
    String bredth=JOptionPane.showInputDialog("Enter breadth","0");
    float area=Float.parseFloat(bredth)*Float.parseFloat(length);
    
    JOptionPane.showMessageDialog(null,"Hi area is: "+area,"Area of a rectangle",JOptionPane.WARNING_MESSAGE);
    }
}
