package quizsoru4;

import java.util.Scanner;

/**
 *
 * @author BATIN
 */
public class QuizSoru4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bus bus = new Bus("20 BAT 78", 42);
        OUTER:
        while (true) {
            System.out.println("1 book seat");
            System.out.println("2 print all passengers");
            System.out.println("3 print avaible seat ids");
            int secim = sc.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Koltuk num giriniz:");
                    int koltuk = sc.nextInt();
                    bus.bookSeat(koltuk);
                    break;
                case 2:
                    bus.printAllPassengers();
                    break;
                case 3:
                    bus.printAllid();
                    break;
                default:
                    break OUTER;
            }
        }
    }

}
