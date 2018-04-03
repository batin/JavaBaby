/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingyourbeer;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author batineryilmaz
 */
public class FindingYourBeer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("How many student goes to the party?");
        Scanner sc=new Scanner(System.in);
        SecureRandom scr=new SecureRandom();
        int N=sc.nextInt();
        int [][] Students=new int[N][2];
        for (int i = 0; i < Students.length; i++) {
            Students[i][0]=i+1;
            Students[i][1]=0;
        }
        int bulan=0;
        System.out.println("Alarm is on.EveryBody goes outside.");
        for (int i = 0; i <Students.length; i++) {
            int sayi=scr.nextInt(N)+1;
            if(Students[i][0]==sayi){
                System.out.println(i+".Student has found his beer");
                bulan++;
            }
                
        }
        if(bulan==0){
            System.out.println("Nobody has found their beer");
        }
        
        
    }
    
}
