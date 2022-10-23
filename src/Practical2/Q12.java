/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;
import java.util.*;
/**
 *
 * @author leong
 */
public class Q12 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the First Base Value: ");
        String base1 = input.next();
        if (!Validate(base1)){
            System.out.println("Invalid Base input!");
            return;
        }
        int base1Int = Integer.parseInt(base1);
        System.out.print("Enter the Last Base Value: ");
        String base2 = input.next();
        if (!Validate(base2)){
            System.out.println("Invalid Base input!");
            return;
        }
        int base2Int = Integer.parseInt(base2);
        for (int i = 1; i <= 25; i++){
            System.out.print(i + "\t");
            for (int j = base1Int; j <= base2Int;j++){
                System.out.print((i*j) + "\t");
            }
            System.out.println("");
        }
    }
    
    public static boolean Validate(String str){
        if (str == null){
            return false;
        }
        try{
            int d = Integer.parseInt(str);
            if (d >= 2 && d<= 8){
                return true;
            }
        }catch (NumberFormatException nfe){
            return false;
        }
        return false;
    }
}
