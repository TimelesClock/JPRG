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
public class Q11 {
    public static void main(String [] args){
        //Defining input module
        Scanner input = new Scanner(System.in);
        
        //Hashmap or "dictionary" for Grade to GPA
        HashMap<String,Double> dict = new HashMap<String,Double>();
        dict.put("A",4.0);
        dict.put("B",3.0);
        dict.put("C",2.0);
        dict.put("D",1.0);
        
        //Some variable initialization, very yes naming system
        int credit = 0;
        int total = 0;
        String in = "1";
        int in2;
        int count = 1;
        while(!"0".equals(in)){
            System.out.print(String.format("Enter grade for module #%d (or enter 0 to stop) : ",count));
            in = input.next();
            if (dict.containsKey(in)){
                System.out.print(String.format("Enter credit units for module #%d : ",count));
                in2 = input.nextInt();
                credit += in2;
                total += (in2*dict.get(in));
                count += 1;
            }else if ("0".equals(in)){
                break;
            }else{
                //Very minimal data validation, not validating 2nd input
                System.out.println("No Such Grade");
            }
        }
        double gpa = Double.valueOf(total)/Double.valueOf(credit);
        System.out.println(String.format("\nYour total Credit units : %d",credit));
        System.out.println(String.format("Your GPA is %.2f",gpa));
    }
}
