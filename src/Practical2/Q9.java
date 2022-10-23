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
public class Q9 {
    public static void main(String [] args){
        int out;
        System.out.println("-= Display contents of numberArray[] =-");
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0;i < 100;i++){
            if (i % 2 == 0){
                out = 1;
            }else{
                out = 2;
            }
            System.out.println(String.format("numberArray[%d] = %d",i,out));
        }
    }
}
