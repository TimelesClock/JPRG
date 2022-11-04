/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical3.Q5;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author leong
 */
public class School {

    private Person[] persons;
    // used to store lecturer or student objects
    private int numOfPeople;
    // used to keep track of the number of people
    
    public int count;

    public School() {
        numOfPeople = 0; // School is empty initially
        populateSchool();
        displayPopulation();
    }

    public void populateSchool() {
        Random rand = new Random();
        String inStr = JOptionPane.showInputDialog(
                null,
                "Enter number of people to create: ",
                "School",
                JOptionPane.QUESTION_MESSAGE);
        numOfPeople = Integer.parseInt(inStr);
        persons = new Person[numOfPeople];
        int num;
        for (int i = 0; i < numOfPeople; i++) {
            count = i;
            num = rand.nextInt(2) + 1;
            if (num == 1) {
                createStudent();
            } else {
                createLecturer();
            }
        }
    }

    public void createStudent() {
        String name = JOptionPane.showInputDialog(
                null,
                "Enter Name:",
                "School - Create Student",
                JOptionPane.QUESTION_MESSAGE);

        String inStr = JOptionPane.showInputDialog(
                null,
                "Enter year of Study:",
                "School - Create Student",
                JOptionPane.QUESTION_MESSAGE);

        Student newStudent = new Student(name, inStr.charAt(0));
        persons[count] = newStudent;
    }

    public void createLecturer() {
        String name = JOptionPane.showInputDialog(
                null,
                "Enter Name:",
                "School - Create Lecturer",
                JOptionPane.QUESTION_MESSAGE);
        int no = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Enter number of modules:",
                "Number of modules",
                JOptionPane.QUESTION_MESSAGE));
        String[] module = new String[no];
        for (int i = 1; i <= no; i++) {
            String code = JOptionPane.showInputDialog(
                    null,
                    "Enter Module " + i + " Code",
                    "Module " + i,
                    JOptionPane.QUESTION_MESSAGE);
            module[i - 1] = code;
        }

        Lecturer newLecturer = new Lecturer(name, module);
        persons[count] = newLecturer;
    }

    public void displayPopulation() {
        for (int i = 0; i < persons.length; i++) {
            persons[i].introduce();
        }
    }

    public static void main(String[] args) {
        School school = new School();
    }
}
