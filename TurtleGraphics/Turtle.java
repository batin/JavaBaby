/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.awt.Point;

/**
 *
 * @author batineryilmaz
 */
public class Turtle {

    int[][] oda = new int[20][20];

    

    enum PenStates {
        ON, OFF
    };

    enum CurrentD {
        UP, DOWN, LEFT, RIGHT
    };

    PenStates penState;
    CurrentD direction;
    Point currentPos;

    public Turtle() {
       
        penState = PenStates.ON;
        currentPos = new Point();
        direction = CurrentD.RIGHT;

    }

    public void TLeft() {
        if (direction == CurrentD.UP) {
            direction = CurrentD.LEFT;
        } else if (direction == CurrentD.LEFT) {
            direction = CurrentD.DOWN;
        } else if (direction == CurrentD.DOWN) {
            direction = CurrentD.RIGHT;
        } else {
            direction = CurrentD.UP;
        }

    }

    public void TRight() {

        if (direction == CurrentD.RIGHT) {
            direction = CurrentD.DOWN;
        } else if (direction == CurrentD.UP) {
            direction = CurrentD.RIGHT;
        } else if (direction == CurrentD.DOWN) {
            direction = CurrentD.LEFT;
        } else {
            direction = CurrentD.UP;
        }

    }

    public void penUp() {
        penState = PenStates.ON;
    }

    public void penDown() {
        penState = PenStates.OFF;
    }

    public void Move(int x) {

        if (direction == CurrentD.RIGHT) {
            if (penState == PenStates.ON) {
                for (int i = 0; i <=x; i++) {
                    oda[currentPos.x][currentPos.y + i] = 1;
                }
            }
            currentPos.y += x;
        } else if (direction == CurrentD.LEFT) {
            if (penState == PenStates.ON) {
                for (int i = 0; i <=x; i++) {
                    oda[currentPos.x][currentPos.y - i] = 1;
                }
            }
            currentPos.y -= x;
        } else if (direction == CurrentD.UP) {
            if (penState == PenStates.ON) {
                for (int i = 0; i <=x; i++) {
                    oda[currentPos.x - i][currentPos.y] = 1;
                }
            }
            currentPos.x -= x;
        } else {
            if (penState == PenStates.ON) {
                for (int i = 0; i <=x; i++) {
                    oda[currentPos.x + i][currentPos.y] = 1;
                }
            }
            currentPos.x += x;
        }

    }
    public void Display(){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(oda[i][j]==1)
                System.out.print("# ");
                else
                    System.out.print("_ ");
            }
            System.out.println();
        }
    }
           
}
