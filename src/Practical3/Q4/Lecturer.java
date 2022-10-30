/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3;

/**
 *
 * @author leong
 */
public class Lecturer {
    String name;
    int staffID;
    
    public Lecturer(){}
    
    public Lecturer(String newName,int newID){
        name = newName;
        staffID = newID;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String str){
        name = str;
    }
    
    public double calcMonthlyPay(){
        return 0;
    }
}
