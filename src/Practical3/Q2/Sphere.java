/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q2;

/**
 *
 * @author leong
 */
public class Sphere {
    public double radius = 0.0;
    
    public Sphere(){}
    
    public Sphere(double newRadius){
        set(newRadius);
    }
    
    public double get(){
        return radius;
    }
    
    public void set(double newRadi){
        radius = newRadi;   
    }
    
    public double calculateArea(){
        return 4 * Math.PI * Math.pow(radius,2);
    }
    
    public double calculateVolume(){
        return (4.0/3.0)*Math.PI*Math.pow(radius,3);
    }
}
