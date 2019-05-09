
package quizsoru1;

import java.util.ArrayList;

/**
 *
 * @author BATIN
 */
public class QuizSoru1 {

    
    public static void main(String[] args) {
      ArrayList<Integer> dizi =new ArrayList();
      dizi.add(5);
      dizi.add(53);
      dizi.add(51);
      dizi.add(56);
      dizi.add(5);
      dizi.add(41);
      dizi.add(1);
      dizi.add(22);
      dizi.add(24);
      dizi.add(248);
      dizi.add(8);
      dizi.add(5);
      dizi.add(2);
        System.out.println("Sum of even number/Sum of odd numbers = "+dizi(dizi));
    }
    public static double dizi(ArrayList<Integer> Arr){
        double OddSum=0;
        double EvenSum=0;
        
        for (Integer  sayi : Arr) {
            if(sayi%2==0)
                EvenSum+=sayi;
            else
                OddSum+=sayi;
        }
        return EvenSum/OddSum;
    
    }
}
