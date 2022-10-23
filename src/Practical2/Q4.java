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
public class Q4 {

    public static void main(String[] args) {
        String output;
        String UserInput = JOptionPane.showInputDialog(
                null,
                "Enter a numeric value:",
                "Input",
                JOptionPane.QUESTION_MESSAGE
        );
        switch (UserInput) {
            case "1":
                output = "I";
                break;
            case "2":
                output = "II";
                break;
            case "3":
                output = "III";
                break;
            case "4":
                output = "IV";
                break;
            case "5":
                output = "V";
                break;
            case "6":
                output = "VI";
                break;
            case "7":
                output = "VII";
                break;
            case "8":
                output = "VIII";
                break;
            case "9":
                output = "IX";
                break;
            case "10":
                output = "X";
                break;
            default:
                output = "no";
        }
        if (output != "no") {
            JOptionPane.showMessageDialog(
                    null,
                    "Roman Numeral Value = " + output,
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Out of Range! Pls enter a number between 1 and 10!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
