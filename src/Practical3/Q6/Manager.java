/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q6;

/**
 *
 * @author leong
 */
public class Manager extends Employee{
    private double profit;
    public Manager(String newName,double newSalary,double newProfit){
        super(newName,(newSalary));
        profit = newProfit;
    }
    
    public double calcSalary(){
        return getBaseSalary() + (profit)*0.1;
    }
}
