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
       int [] dizi={1,1,1,1,2,2,3,4,6,8,9,0};
       batin(dizi);
    }
    public static void batin(int[] dizi){
        int[] fr=new int[11];
        int max=0;
        int mod=0;
        for (int d : dizi) {
            ++fr[d];
            if(fr[d]>max){
                max=fr[d];
                mod=d;
            }
        }
        System.out.println("most repeating number = "+mod+" Count = "+max);
    
    }
}
