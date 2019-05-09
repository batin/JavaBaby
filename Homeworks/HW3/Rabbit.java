package Odev3;

import java.security.SecureRandom;

/**
 *
 * @author BATIN
 */
public class Rabbit {

    SecureRandom random = new SecureRandom();
    private int CurrentPoint;//tavsanin konumu
    private int count;//tavsanin sirasi
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

    public Rabbit() {         //constructor
        CurrentPoint = 0;

    }

    @Override
    public String toString() {
        return "HARE{" + count + '}';
    }

    public void moves() {
        int i = random.nextInt(10) + 1;

        if (1 <= i && i <= 2)       //sleep
        {
            this.CurrentPoint += 0;
        } else if (3 <= i && i < 5) //big hop
        {
            this.CurrentPoint += 9;
        } else if (5 == i)         //big sleep
        {
            this.CurrentPoint -= 12;
        } else if (6 <= i && i <= 8)//small hop
        {
            this.CurrentPoint += 1;
        } else                      //small slip
        {
            this.CurrentPoint -= 2;
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
                System.out.print("H");
            }else
            System.out.print("_");
        }
        System.out.println();
    }

}
