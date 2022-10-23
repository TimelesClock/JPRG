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
public class Q2 {

    public static void main(String[] args) {
        int PH;
        String str;
        String UserInput = JOptionPane.showInputDialog(
                null,
                "Enter Ph level of the tested water:",
                "Input",
                JOptionPane.QUESTION_MESSAGE
        );
        PH = Integer.parseInt(UserInput);
        if (PH > 7) {
            str = "alkaline";
        } else if (PH < 7) {
            str = "acidic";
        } else {
            str = "neutral";
        }
        JOptionPane.showMessageDialog(
                null,
                "Your aqaurium water is " + str,
                "Message",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
