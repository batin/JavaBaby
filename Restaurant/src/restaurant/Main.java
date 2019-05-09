
package restaurant;

import java.util.Scanner;

/**
 *
 * @author BATIN
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurant R78 = new Restaurant("IronSky", "Denizli", "BATIN", 78);
        boolean flag = true;
        while (flag) {
            System.out.println("1 To Book Table");
            System.out.println("2 To See The Menu");
            System.out.println("3 To See Avalible Tables");
            System.out.println("0 To Leave");
            
            int secim = sc.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("How mant Table You Want to book?");
                    R78.BookTable(sc.nextInt());
                    break;
                case 2:
                    R78.ShowMenu();
                    break;
                case 3:
                    R78.ShowTables();
                    break;
                default:
                    flag = false;
            }

        }
    }
}
