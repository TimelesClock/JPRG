/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q4;

/**
 *
 * @author leong
 */
public class FullTimeLecturer extends Lecturer{
    String[] PTClass;
    int[] classSize;
    double salary;
    
    public FullTimeLecturer(String newName,int newID,String[] newPTClass,int[] newclassSize,double newSalary){
        name = newName;
        staffID = newID;
        PTClass = newPTClass;
        classSize = newclassSize;
        salary = newSalary;
    }
    
    public double calcMonthlyPay(){
        return salary;
    }
    
    public double calcPTLunchSubsidy(){
        double total = 0;
        for (double i:classSize){
            total += i*10.0;
        }
        return total;
    }
}
