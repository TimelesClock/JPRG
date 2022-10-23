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
public class Q13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a charcater to be used for printing the triangle: ");
        String in = input.next();
        if ("".equals(in) || in == null || in.length() != 1) {
            in = "*";
        }
        
        System.out.print("Enter the height of the triangle: ");
        String height = input.next();
        int height2;
        try{
            height2 = Integer.parseInt(height);
            if (height2 > 10 || height2 <= 1){
                height2 = 3;
            }
        }catch(NumberFormatException nfe){
            height2 = 3;
        }
        
        for (int i = 1; i <= (height2*2)-1;i++){
            if (i>height2){
                System.out.println(in.repeat(height2-(i-height2)));
            }else{
                System.out.println(in.repeat(i));
            }
        }
    }
}
