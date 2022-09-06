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
        
        //Output
        Scanner sc = new Scanner(System.in);
        System.out.printf("Family Member 1%nName: %s%nAge: %i%nIs in high school: %b", name1, age1, isInHS1);
    }
    
}
