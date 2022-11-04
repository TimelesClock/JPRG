/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q5;

/**
 *
 * @author leong
 */
public class Student extends Person{
    private char stdYear;
    
    public Student(String newName,char newStdYear){
        super(newName);
        stdYear = newStdYear;
    }
    
    public char getYear(){
        return stdYear;
    }
    
    public void introduce(){
        super.introduce();
        System.out.println("I am a year "+getYear()+" student.");
    } 
}
