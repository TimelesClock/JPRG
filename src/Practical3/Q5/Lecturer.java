/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q5;

/**
 *
 * @author leong
 */
public class Lecturer extends Person{
    private String[] modules;
    public Lecturer(){
    }
    
    public Lecturer(String newName,String[] newModule){
        super(newName);
        modules = newModule;
    }
    
    public String getModule(int index){
        return modules[index];
    }
    
    public String[] getModules(){
        return modules;
    }
    
    public void introduce(){
        System.out.println("My name is "+getName()+"\nI am the lecturer of the following subjects:");
        for(int i = 0;i<modules.length;i++){
            System.out.println((i+1)+"."+modules[i]);
        }
    }
}
