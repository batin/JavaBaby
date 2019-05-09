/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

/**
 *
 * @author BATIN
 */
public class ShipTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ship []s1 = new Ship[3];
       s1[0]=new Ship("Wisconsin","1991");
       s1[1]=new CargoShip(1500,"Jersey","1987");
       s1[2]=new Cruise(1001,"Donald","2001");
        for (Ship ship : s1) {
            System.out.println(ship);
        }
    }
    
}
