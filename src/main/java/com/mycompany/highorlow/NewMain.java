/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.highorlow;

import java.util.Scanner;

/**
 *
 * @author scott
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int MAX=1000;
        // TODO code application logic here
        int randNum=(int)(Math.random()*MAX);
        int cycle=0;
        int test=0;
        System.out.println("enter a number: ");
        do{
         Scanner s= new Scanner(System.in);
         test=s.nextInt();
         if(test> randNum) System.out.println("too high.");
         if(test<randNum) System.out.println("too low.");
         cycle++;
        }while(test!=randNum && cycle<50);
        
        if(cycle>=50 && test!=randNum) System.out.println("tries exceeded.");
        if(test==randNum) System.out.println("you guessed it, the number is: "+randNum);
    }
    
}
