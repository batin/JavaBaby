package projecteuler601;

import java.util.Scanner;

public class ProjectEuler601 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
      /*  System.out.println("Enter s");
        int input = sc.nextInt();
        System.out.println("Enter N");
        int N = sc.nextInt();*/
        for (int j = 1; j < 31;j++) {
        
            if (streak(j) ==streak(Math.pow(4,j))) {
                //System.out.println("Steak("+i+")="+streak(i));
                counter++;
//System.out.print("i");
            }
        
        System.out.println(counter);
        }
        

    }

    public static int streak(double n) {
        int i;
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                //System.out.println(n+"is divisible by "+i);
                n++;
            } else {
                //System.out.println(n+"is not divisible by "+i);
                break;
            }
        }

        return i - 1;
    }
}
