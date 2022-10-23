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
public class Q5 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String grade;
        int in = 0;
        int count = 1;
        int total = 0;
        while (in != -1){
            System.out.print(String.format("Enter score# %d (or enter -1 to stop) : ",count));
            in = input.nextInt();
            total += in;
            count++;
        }
        total += 1;
        double average = Double.valueOf(total)/Double.valueOf(count -2);
        if (average >= 80){
            grade = "A";
        }else if (average >= 70){
            grade = "B";
        }else if (average >= 60){
            grade = "C";
        }else if (average >= 50){
            grade = "D";
        }else{
            grade = "F";
        }
        System.out.println(String.format("Average Scores = %1$.2f Grade = %2$s",average,grade));
    }
}
