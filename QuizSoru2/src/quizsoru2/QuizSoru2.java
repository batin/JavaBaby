/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizsoru2;

/**
 *
 * @author BATIN
 */
public class QuizSoru2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] dizi = {1,1,5,8,9,1,1,2,2,3,4,6,5,7,9,9,8,8,8,8,8,5,5,5,5,5,8,9,0};
        batin(dizi);

    }

    public static void batin(int[] dizi) {
        int[] fr = new int[11];
        int max = 0;
        int mod = 0;
        for (int d : dizi) {
            fr[d]++;
            if (fr[d] > max) {
                max = fr[d];
                mod = d;
            }
        }
        System.out.println("most repeating number = " + mod + " Count = " + max);
        for (int i = max; i > 0; i--) { //dikey histogram
            for (int j = 0; j < fr.length; j++) {
                if (i==fr[j]) {
                    System.out.print(" 0 ");
                    fr[j]--;
                }else{
                    System.out.print("   ");
                }
            }System.out.println();
        }
        System.out.println("----------------------------------");
        System.out.println(" 0  1  2  3  4  5  6  7  8  9 ");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        /*for (int i = 0; i < fr.length; i++) {//yatay hisyogram
            for (int j = 0; j < fr[i]; j++) {
                if(j==0){
                    System.out.print(i+"|");
                }
                System.out.print(" 0 ");
            }System.out.println();
        }
    */
    
    
    }
}
