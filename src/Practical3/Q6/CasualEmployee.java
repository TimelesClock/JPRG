/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q6;

/**
 *
 * @author leong
 */
public class CasualEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;
    
    public CasualEmployee(String newName,double newRate,int newHours){
        super(newName,0);
        hourlyRate = newRate;
        hoursWorked = newHours;
    }
    
    public double calcSalary(){
        return hourlyRate*hoursWorked;
    }
}
