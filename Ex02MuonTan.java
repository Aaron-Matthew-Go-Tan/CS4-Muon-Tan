/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02muontan;

/**
 *
 * @author MUON
 */

import java.util.Scanner;
public class Ex02MuonTan {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables
        int counter = 0;
        int random = (int) Math.floor(Math.random()*10) + 1;
        
        // Initial interface
        System.out.println("Welcome to Higher or Lower! What will you do? (Type s or e)\n" +
            "s - Start game\n" +
            "e - End application\n");
            char startEnd = sc.next().charAt(0);
            
        //Game proper
        while (startEnd == 's') {
            System.out.printf("You have %d guess(es) left. What is your guess?", counter);
            
            System.out.println("hi.");
            startEnd = 'e';
        }
    }
    
}
