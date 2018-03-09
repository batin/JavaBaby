
package odev1;

import java.util.Scanner;

public class ODEV1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
while(true){
    System.out.println("Enter 1 to Factorial ");
    System.out.println("Enter 2 to E Value");
    System.out.println("Enter 0 to EXIT");
        int choice = sc.nextInt();
       if(choice==1){
        System.out.print("Enter the number:");
        int input = sc.nextInt();
        System.out.printf("%d! = %d %n",input,Loop(input));
            }
       if(choice==2){
        System.out.print("Enter the number:");
        int input2 = sc.nextInt();
        System.out.println("e = "+Evalue(input2));
            }
        if(choice==0)
            break;
}

}
    
static int Loop(int N){
    if(N==0)
        return 1;
    else 
        return N*(Loop(N-1));
}

    static Double Evalue(int V) {
   double sum=1;
    while(V>0){
    sum+=(double)1/Loop(V);
      V--;
    }
    return sum;
    }
}
