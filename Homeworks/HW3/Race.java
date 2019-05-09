/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Odev3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author BATIN
 */
public class Race {

    ArrayList list = new ArrayList();
    Scanner sc = new Scanner(System.in);
    Turtle[] turtles;
    Rabbit[] rabbits;
    int R, rCounter = 0;
    int T, tCounter = 0;

    public Race() {
        System.out.print("Please Enter Number of HARES   :");
        int NumberofRabbits = sc.nextInt();
        System.out.print("Please Enter Number of TORTOISE:");
        int NumberofTurtles = sc.nextInt();
        rabbits = new Rabbit[NumberofRabbits];
        turtles = new Turtle[NumberofTurtles];

        for (int i = 0; i < rabbits.length; i++) {
            rabbits[i] = new Rabbit();
            rabbits[i].setCount(i + 1);//tavsan sirasini ayarliyor

        }
        for (int i = 0; i < turtles.length; i++) {
            turtles[i] = new Turtle();
            turtles[i].setCount(i + 1);//kaplumbaga sirasini ayarliyor
        }

    }

    public void start() {
        int counter = 0;

        while (win()) {
            counter++;
            System.out.println(counter + ".ROUND");
            for (Turtle turtle : turtles) {
                turtle.moves();
            }
            for (Rabbit rabbit : rabbits) {
                rabbit.moves();
            }

        }
        Results();

    }

    /*--------kazanan kontrolu yapan fonksiyon---------*/
    public boolean win() {
        for (Turtle turtle : turtles) {
            if (turtle.getCurrentPoint() >= 70) {
                return false;
            }
        }
        for (Rabbit rabbit : rabbits) {
            if (rabbit.getCurrentPoint() >= 70) {
                return false;
            }
        }
        return true;

    }

    /*-----------sonuclari kontrol eden fonksiyon----------*/
    public void Results() {
        for (Turtle turtle : turtles) {
            if (turtle.getCurrentPoint() >= 70) {
                list.add(turtle);   //kazanan kaplumbagalari listeye ekliyor
            }
        }
        for (Rabbit rabbit : rabbits) {
            if (rabbit.getCurrentPoint() >= 70) {
                list.add(rabbit);   //kazanan tavsanlari listeye ekliyor
            }
        }
        if (list.size() == 1) {//kazanan 1 kisi mi var diye kontrol ediyor
            //kazananin tavsan mi kaplumbaga mi oldugunu anlamak icin ilk harfine bakiyor
            System.out.print(list.get(0).toString());
            System.out.println(( list.get(0).toString().charAt(0) == 'H') ?" wins. Yuch" : " WINS!!! YAY!!");//short if
            
        } else {
            System.out.print("It's tie between ");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(((i == list.size() || i == 0) ? "" : " and ") + list.get(i).toString());//short if
            }

        }

    }

}
