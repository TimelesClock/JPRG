/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q5;

/**
 *
 * @author leong
 */
public class Person{
    private String name;
    
    public Person(){
    }
    
    public Person(String newName){
        setName(newName);
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public String getName(){
        return name;
    }
    
    public void introduce(){
        System.out.println("My name is "+name);
    }
}
