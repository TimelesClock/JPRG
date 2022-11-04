/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q4;

/**
 *
 * @author leong
 */
public class PartTimeLecturer extends Lecturer{
    double hourlyRate;
    double monthlyHours;
    
    public PartTimeLecturer(){}
    
    public PartTimeLecturer(String newName,int newID,double rate, double hour){
        name = newName;
        staffID = newID;
        hourlyRate = rate;
        monthlyHours = hour;
    }
    
    public double calcMonthlyPay(){
        return hourlyRate*monthlyHours;
    }
}
