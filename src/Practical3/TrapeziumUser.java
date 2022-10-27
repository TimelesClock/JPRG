/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3;

/**
 *
 * @author leong
 */
public class TrapeziumUser extends Trapezium{
    public static void main(String [] args){
        Trapezium trap = new Trapezium();
        System.out.println("Trapezium class program started.\n");
        System.out.println("This trapezium has base value "+trap.base);
        System.out.println("This trapezium has top value "+trap.top);
        System.out.println("This trapezium has height value "+trap.height);
        
        System.out.println("\nThe area of the trapezium is "+trap.getArea());
        System.out.println("\nTrapezium class program terminated.");
    }
}
