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
        while (true) {
            System.out.println("1 to Book seat");
            System.out.println("2 to Print all passengers");
            System.out.println("3 to Print avaible seat ids");
            System.out.println("4 to Search pasenger by name");
            System.out.println("5 to Search pasenger by seatnumber");
            int secim = sc.nextInt();
            if (secim == 1) {
                System.out.println("Koltuk num giriniz:");
                int koltuk = sc.nextInt();
                bus.bookSeat(koltuk);
            } else if (secim == 2) {
                bus.printAllPassengers();
            } else if (secim == 3) {
                bus.printAllid();
            } else if (secim == 4) {
                bus.search();
            } else if (secim == 5) {
                bus.findSeat();
            } else {
                break;
            }
        }
    }

}
