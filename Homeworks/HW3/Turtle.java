package Odev3;

import java.security.SecureRandom;

/**
 *
 * @author BATIN
 */
public class Turtle {

    SecureRandom random = new SecureRandom();
    private int CurrentPoint;
    private int count;

    /*--------GETTER-SETTER---------------*/
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCurrentPoint() {
        return CurrentPoint;
    }

    public void setCurrentPoint(int CurrentPoint) {
        this.CurrentPoint = CurrentPoint;
    }

    public Turtle() {          //constructor
        CurrentPoint = 0;
    }

    @Override
    public String toString() {
        return " TORTOISE{" + count + '}';
    }

    public void moves() {
        int i = random.nextInt(10) + 1;
        if (1 <= i && i <= 5)       //fast plod
        {
            this.CurrentPoint += 3;
        } else if (6 <= i && i < 8) //slip
        {
            this.CurrentPoint -= 6;
        } else                      //slow pod
        {
            this.CurrentPoint += 1;
        }
        if (this.CurrentPoint <= 0) {
            setCurrentPoint(0);
        }
        //cizdirme kisimi
        for (int j = 1; j <= 70; j++) {
            if (this.CurrentPoint >= 70) {
                this.CurrentPoint = 70;
            }
            if (this.CurrentPoint == j) {
                System.out.print("T");
            }else
                System.out.print("_");
        }
        System.out.println();
    }

}
