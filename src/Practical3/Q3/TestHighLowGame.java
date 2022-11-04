/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q3;
import javax.swing.JOptionPane;
/**
 *
 * @author leong
 */
public class TestHighLowGame extends HighLowGame{

    public static void main(String[] args) {
        HighLowGame game = new HighLowGame();
        JOptionPane.showMessageDialog(null,"Welcome to The High Low Number Game");
        
        //Create an instance of the HighLowGame called game
        //Invoke generateRandomNumber() to generate random Number
        game.generateRandomNumber();
        do {
            game.getUserInput();
            JOptionPane.showMessageDialog(null,game.getResult());
        //Invoke getUserInput()
        //Display the result by invoking getResult()
        } while (!game.gameEnded());
    }
}
