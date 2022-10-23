/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

/**
 *
 * @author leong
 */
public class Q6 {
    public static void main(String[] args){
        System.out.println(box()+"\n"+information()+"\n"+box());
    }
    
    static String box(){
        return "*************************************************";
    }
    
    static String information(){
        return 
        """
                       Andy Leong
        Age            : 17
        Sex            : Male
        Location       : Singapore
        Marital Status : Single
        """;
    }
}
