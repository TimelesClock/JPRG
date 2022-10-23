/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;

/**
 *
 * @author leong
 */
public class Q10 {
    public static void main(String [] args){
        int[] arr = {11,0,10,2,2};
        int max = arr[0];
        String str = "";
        for (int number: arr){
            if (number > max){
                max = number;
            }
            str += number + " ";
        }
        
        System.out.println("Elements of int array: "+str);
        System.out.println("Highest Element: "+max);
    }
}
