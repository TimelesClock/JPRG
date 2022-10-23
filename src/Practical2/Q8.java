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
public class Q8 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total seconds: ");
        int seconds = input.nextInt();
        System.out.println("\n\tTime Converter");
        int temp = seconds;
        double hours = Math.floor(temp/3600);
        int hour = (int)Math.round(hours);
        temp -= hours*3600;
        double minutes = Math.floor(temp/60);
        int minute = (int)Math.round(minutes);
        temp -= minutes*60;
        System.out.println(String.format(
      """
        Total Seconds: %d
        Hours:         %d  
        Minutes:       %d
        Seconds:       %d
        """,seconds,hour,minute,temp));
    }
}
