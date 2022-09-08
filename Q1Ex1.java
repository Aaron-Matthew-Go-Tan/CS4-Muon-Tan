/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex1;

import java.util.Scanner;

/**
 *
 * @author MUON
 */
public class Q1Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Object 1
        String name1 = "Aaron Tan";
        int age1 = 16;
        boolean isInHS1 = true;
        
        //Object 2
        String name2 = "Alysa Tan";
        int age2 = 14;
        boolean isInHS2 = true;
        
        //Object 3
        String name3= "Michele Tan";
        int age3 = 47;
        boolean isInHS3 = false;
        
        
        //For operations section
        int sum = age1 + age2 + age3;
        boolean bothInHS = isInHS1 && isInHS2;
        boolean isOlder = age2 > age3;
        
        //Output
        Scanner sc = new Scanner(System.in);
        System.out.printf("Family Member 1%nName: %s%nAge: %d%nIs in high school: %b%n%n", name1, age1, isInHS1);
        System.out.printf("Family Member 2%nName: %s%nAge: %d%nIs in high school: %b%n%n", name2, age2, isInHS2);
        System.out.printf("Family Member 3%nName: %s%nAge: %d%nIs in high school: %b%n%n%n", name3, age3, isInHS3);
        
        //Operations
        System.out.printf("Sum of everyone's ages: %d%n", sum);
        System.out.printf("Are both Aaron and Alysa in high school?: %b%n", bothInHS);
        System.out.printf("Is Alysa older than Michele?: %b%n", isOlder);
}       
    }   
