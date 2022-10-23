/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

/**
 *
 * @author leong
 */
import java.util.*;
public class Q1 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter MST Scores : ");
        int MST = input.nextInt();
        System.out.print("Enter Assignment 1 Scores : ");
        int A1 = input.nextInt();
        System.out.print("Enter Assignment 2 Scores : ");
        int A2 = input.nextInt();
        System.out.print("Enter General Performance Scores : ");
        int GP = input.nextInt();
        double Final = (MST * 0.2)+(A1 *0.25) + (A2*0.35)+ (GP *0.2);
        System.out.format("Your final scores: %.2f",Final);
    }
}
