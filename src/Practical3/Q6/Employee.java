/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q6;

/**
 *
 * @author leong
 */
abstract class Employee {

    private String name;
    private double baseSalary;
    
    public Employee(String newName,double newSalary){
        name = newName;
        baseSalary = newSalary;
    }
    
    public String getName(){
        return name;
    }
    
    public double getBaseSalary(){
        return baseSalary;
    }
    
    public abstract double calcSalary();
}
