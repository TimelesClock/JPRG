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
        String[] arr =  new String[] {"11","0","10","2","2"};
        
        System.out.println("Elements of int array: "+String.join(" ",arr));
        System.out.println("Highest Element: "+max(arr));
    }
    
    public static int max(String[] arr){
        int max = Integer.parseInt(arr[0]);
        for (String number:arr){
            if (Integer.parseInt(number)>max){
                max = Integer.parseInt(number);
            }
        }
        return max;
    }
}
