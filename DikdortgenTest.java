
package BatinEryilmaz;


public class DikdortgenTest {

    public static void main(String[] args) {
      Dikdortgen d1 = new Dikdortgen();
      System.out.print("1: ");
      d1.Display();
      Dikdortgen d2 = new Dikdortgen(2,5,3,2);
      System.out.print("2: ");
      d2.Display();
      System.out.print("Deger 2:");
      d2.Round();
      d2.Area();
      Dikdortgen d3 = new Dikdortgen(4,5,-1,5);
      d3.LeftRight(-4);
      d3.UpDown(2);
      d3.Display();
      
    }
    
}
