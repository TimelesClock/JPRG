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
public class Q3 {
    public static void main(String[] args){
        double BMI;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your option:\n1) Metric Imperial\n2) Imperial\n>>");
        int option = input.nextInt();
        if (option == 1){
            System.out.print("Enter your weight in kilograms : ");
            double weight = input.nextDouble();
            System.out.print("Enter your height in metres (e.g 1.75) : ");
            double height = input.nextDouble();
            BMI = weight/(height*height);
        }else{
            System.out.print("Enter your weight in pounds : ");
            double weight = input.nextDouble();
            System.out.print("Enter your height in inches : ");
            double height = input.nextDouble();
            BMI = (weight*703)/(height*height);
        }
        if (BMI >= 25){
            System.out.format("Your BMI is %1$.1f and you are %2$s",BMI,"Overweight\n");
        }else if (BMI >= 18.5){
            System.out.format("Your BMI is %1$.1f and you are %2$s",BMI,"Normal\n");
        }else{
            System.out.format("Your BMI is %1$.1f and you are %2$s",BMI,"Underweight\n");
        }
    }
}
