/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;




/**
 *
 * @author batineryilmaz
 */
public class Main {  
        
	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
               System.out.println("1 to pen up");
               System.out.println("2 to pen down");
               System.out.println("3 to turn right");
               System.out.println("4 to turn left");
               System.out.println("5 to move");
               System.out.println("6 to display");
               System.out.println("9 to cikis");
               int secim =0;
               String str[];
               Turtle t=new Turtle();
               while(secim!=9){
               str = sc.nextLine().split(",");
               secim=Integer.parseInt(str[0]);
               switch(secim){
                   case 1:
                       t.penUp();
                       break;
                   case 2:
                       t.penDown();
                       break;
                   case 3:
                       t.TRight();
                        break;
                   case 4:
                       t.TLeft();
                        break;
                   case 5:
                       t.Move(Integer.parseInt(str[1]));
                        break;
                   case 6:
                       t.Display();
                        break;
                   case 9:
                        break;
                   default:
                       System.out.println("hatali secim");
                       
                   
                   
               }
               
               
               
               
           }

    	}
}