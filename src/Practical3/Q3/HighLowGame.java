/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q3;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author leong
 */
public class HighLowGame {
    
    int randomNumber;
    int guess;
    boolean gameEnd = false;
    
    public void generateRandomNumber(){
        Random rand = new Random();
        randomNumber = rand.nextInt(100);
    }
    
    public void getUserInput(){
        String in = JOptionPane.showInputDialog(null,"Enter your guess.");
        guess = Integer.parseInt(in);
    }
    
    public String getResult(){
        String result;
        if (guess > randomNumber){
            result = String.format("%d is higher than the Magic Number",guess);
        }else if (guess < randomNumber){
            result = String.format("%d is lower than the Magic Number",guess);
        }else{
            result = String.format("%d is the Magic Number",guess);
            gameEnd = true;
        }
        return result;
    }
    
    public boolean gameEnded(){
        return gameEnd;
    }
}
