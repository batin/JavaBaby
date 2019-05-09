<<<<<<< HEAD:ODEV1/src/odev1/ODEV1.java

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

String a="ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";
       a b  t23
       d y  z28
       5 28 23
       d z  t
               
       d y  z +28
       0 1 23
       a b  t
               
        System.out.println("harf:" a.charAt(8));
System.out.println(""+a.indexOf("G"));

sb.append(w);
 
String b= sb.toString();

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
=======

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
>>>>>>> 2d1219ced471601340ef2b06ed54d25febd98117:Homeworks/HW1/ODEV1.java
