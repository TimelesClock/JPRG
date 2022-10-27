/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3;

/**
 *
 * @author leong
 */
public class Trapezium {
    public double base = 6.0;
    public double top = 5.0;
    public double height = 4.0;
    
    public Trapezium(){}
    
    public Trapezium(double newBase,double newTop,double newHeight){
        base = newBase;
        top = newTop;
        height = newHeight;
    }
    
    public double getArea(){
        return (base+top)*height/2;
    }
}
