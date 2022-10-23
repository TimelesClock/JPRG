    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;
import javax.swing.*;
/**
 *
 * @author leong
 */
public class Q7 {
    public static void main(String[] args){
        double height = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Enter the Height",
                "Input",
                JOptionPane.QUESTION_MESSAGE
        ));
        double width = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Enter the Width",
                "Input",
                JOptionPane.QUESTION_MESSAGE
        ));
        JOptionPane.showMessageDialog(
                null,
                String.format("""
                Summary of Rectangle Measurements
                Height : %.1f
                Width  : %.1f
                Area   : %.1f
                Perimeter: %.1f
                """,height,width,height*width,height*2+width*2),
                "Message",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
