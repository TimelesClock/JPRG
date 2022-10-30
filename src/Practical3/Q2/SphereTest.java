/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3;

import javax.swing.JOptionPane;

/**
 *
 * @author leong
 */
public class SphereTest extends Sphere {

    public static void main(String[] args) {
        String in;
        do {
            in = JOptionPane.showInputDialog(null, "Enter the radius of the sphere:");
            if ("".equals(in)) {
                JOptionPane.showMessageDialog(null, "No value entered.\nPlease enter again...", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while ("".equals(in));

        double radi = Double.parseDouble(in);
        Sphere sphere = new Sphere(radi);
        double area = sphere.calculateArea();
        double volume = sphere.calculateVolume();
        JOptionPane.showMessageDialog(null, "The area of the sphere is: " + area + "\nThe volume of the sphere is: " + volume);
    }
}













