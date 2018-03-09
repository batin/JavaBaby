package PieNumberNiceness;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 # Batın Eryilmaz  14253506 # 
*/
public class PieAccuracyRating {

     
      @SuppressWarnings("StringEquality")
      public static void main(String[] args)
      {
          
    
          DecimalFormat pi1 = new DecimalFormat("#.#");
          DecimalFormat pi2 = new DecimalFormat("#.##");
          DecimalFormat pi3 = new DecimalFormat("#.###");
          DecimalFormat pi4 = new DecimalFormat("#.####");
          DecimalFormat pi5 = new DecimalFormat("#.#####");
          DecimalFormat pi6 = new DecimalFormat("#.######");
          DecimalFormat pi7 = new DecimalFormat("#.#######");
          DecimalFormat pi8 = new DecimalFormat("#.########");
          
             	 int i = 0;
                   double pi = 0;
   	 float deneme = 0;                                             
   	 float deneme1 = 0;                                             
   	 float basari = 0;                                            
   	 float basari1 = 0;                                            
   	 double x, y;                                                 
   	 								
   	 								
   	
                   System.out.print("Virgulden istenen hassasiyet(1-8):");								
   	Scanner sc =  new Scanner(System.in);
                   int basamak =sc.nextInt();
                 while(true){                       
   	    x = Math.random();                   
   	    y = Math.random();                                                
   									
   	    deneme++;                                                        
   									
   	    if ( x*x + y*y <= 1 )             
   	       basari++;   
               pi = 4* (double)basari/(double)deneme;
            //System.out.println("ilk deneme"+deneme+"ilk pi"+pi2.format(4* (double)basari/(double)deneme));
             if( "3,14".equalsIgnoreCase(pi2.format(pi))){
                        break;
                    }
            
            
                    }
                 
           
                   switch (basamak){
                       
                       
                    case 1:
                           
                         while(true)                              
   	 {                                                            
   	    x = Math.random();                   
   	    y = Math.random();                                                
   									
   	    deneme1++;                                                        
   									
   	    if ( x*x + y*y <= 1 )             
   	       basari1++; 
                             
                            if( pi1.format( 4*(double)basari1 / (double)deneme1 ).equalsIgnoreCase(pi1.format(pi)) ){
                                     System.out.println("Deneme sayisi:"+deneme1);
                                     System.out.println("Sonuc = " + pi1.format( 4*(double)basari1 / (double)deneme1 ) );
                                     break;
                                 }
   	 }
                         break; 
         case 2:
                      int basari2 = 0;   
                      int deneme2 = 0; 
                             while(true)                              
   	 {                                                            
   	    x = Math.random();                   
   	    y = Math.random();                                                
   									
   	    deneme2++;                                                        
   									
   	    if ( x*x + y*y <= 1 )             
   	       basari2++; 
                             
                            if( pi2.format( 4*(double)basari2 / (double)deneme2 ).equalsIgnoreCase(pi2.format(pi)) ){
                                     System.out.println("Deneme sayisi:"+deneme2);
                                     System.out.println("Sonuc = " +pi2.format( 4*(double)basari2 / (double)deneme2 ) );
                                     break;
                                 }
   	 }
                 
                         break; 
         case 3:
                      int basari3 = 0;   
                      int deneme3 = 0;                          
                     while(true)   
   	 {                                                            
   	    x = Math.random();                   
   	    y = Math.random();                                                
              
   									
   	    deneme3++;                                                        
              
   									
   	    if ( x*x + y*y <= 1 )             
   	       basari3++; 
                             
                            if( pi3.format( 4*(double)basari3 / (double)deneme3 ).equalsIgnoreCase(pi3.format(pi)) ){
                                     System.out.println("Deneme sayisi:"+deneme3);
                                     System.out.println("Sonuc = " + pi3.format( 4*(double)basari3 / (double)deneme3 ) );
                                     break;
                                 }
   	 }
                         break;    
         case 4:
                     int basari4 = 0;   
                     int deneme4 = 0; 
                     while(true)                              
   	 {                                                            
   	    x = Math.random();                   
   	    y = Math.random();                                                
   									
   	    deneme4++;                                                        
   									
   	    if ( x*x + y*y <= 1 )             
   	       basari4++; 
                             
                       if( pi4.format( 4*(double)basari4 / (double)deneme4 ).equalsIgnoreCase(pi4.format(pi)) ){
                                     System.out.println("Deneme sayisi:"+deneme4);
                                     System.out.println("Sonuc = " + pi4.format( 4*(double)basari4 / (double)deneme4 ) );
                                     break;
                                 }
   	 }
                         break; 
     
         case 5:
                      int basari5 = 0;   
                      int deneme5 = 0; 
                      while(true)                              
   	 {                                                            
   	    x = Math.random();                   
   	    y = Math.random();                                                
   									
   	    deneme5++;                                                        
   									
   	    if ( x*x + y*y <= 1 )             
   	       basari5++; 
                             
                            if( pi5.format( 4*(double)basari5 / (double)deneme5 ).equalsIgnoreCase(pi5.format(pi)) ){
                                     System.out.println("Deneme sayisi:"+deneme5);
                                     System.out.println("Sonuc = " + pi5.format( 4*(double)basari5 / (double)deneme5 ) );
                                     break;
                                 }
   	 }
                         break; 

         case 6:
                     int basari6 = 0;   
                     int deneme6 = 0; 
                     while(true)                              
   	 {                                                            
   	    x = Math.random();                   
   	    y = Math.random();                                                
   									
   	    deneme6++;                                                        
   									
   	    if ( x*x + y*y <= 1 )             
   	       basari6++; 
                             
                            if( pi6.format( 4*(double)basari6 / (double)deneme6 ).equalsIgnoreCase(pi6.format(pi)) ){
                                     System.out.println("Deneme sayisi:"+deneme6);
                                     System.out.println("Sonuc = " + pi6.format( 4*(double)basari6 / (double)deneme6 ) );
                                     break;
                                 }
   	 }
                         break; 
    
         case 7:
                      int basari7 = 0;   
                      int deneme7  = 0; 
                     while(true)                              
   	 {                                                            
   	    x = Math.random();                   
   	    y = Math.random();                                                
   									
   	    deneme7++;                                                        
   									
   	    if ( x*x + y*y <= 1 )             
   	       basari7++; 
                             
                            if( pi7.format( 4*(double)basari7 / (double)deneme7 ).equalsIgnoreCase(pi7.format(pi)) ){
                                     System.out.println("Deneme sayisi:"+deneme7);
                                     System.out.println("Sonuc = " + pi7.format( 4*(double)basari7 / (double)deneme7 ) );
                                     break;
                                 }
   	 }
                         break; 
      
         case 8:
                      int basari8 = 0;   
                      int deneme8  = 0; 
                            while(true)                              
   	 {                                                            
   	    x = Math.random();                   
   	    y = Math.random();                                                
   									
   	    deneme8++;                                                        
   									
   	    if ( x*x + y*y <= 1 )             
   	       basari8++; 
                             
                            if( pi8.format( 4*(double)basari8 / (double)deneme8 ).equalsIgnoreCase(pi8.format(pi)) ){
                                     System.out.println("Deneme sayisi:"+deneme8);
                                     System.out.println("Sonuc = " + pi8.format( 4*(double)basari8 / (double)deneme8 ) );
                                     break;
                                 }
   	 }
                         break; 
      }  
 
     }

}


      
