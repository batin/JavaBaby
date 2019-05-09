package BatinEryilmaz;

import java.util.Scanner;

public class VigenereChiper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alfabe afb = new Alfabe("ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ","BATIN");
        
        while (true) {
            System.out.println("Enter 1 -> Sifreleme");
            System.out.println("Enter 2 -> Sifre cozme");
            System.out.println("Enter 3 -> Sifreleme metni degistirme");
            System.out.println("Enter 0 -> EXIT");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Sifrelemek istediginiz metni girin");
                System.out.print("Girdi:");
                String girdi = sc.next();
                afb.setGirdi(girdi.toUpperCase());
                sifrele(afb);
                afb.CiktiYazdir();
                

            }

            if (choice == 2) {
                System.out.println("Cozmek istediginiz metni girin");
                System.out.print("Girdi:");
                String girdi2 = sc.next();
                afb.setGirdi(girdi2.toUpperCase());
                coz(afb);
                afb.CiktiYazdir();
          
            }

            if (choice == 3) {
                System.out.println("Sifreleme metni girin");
                afb.setKeygen(sc.next().toUpperCase());
            }
            if (choice == 0) {
                break;
            }
        }

    }

    public static void sifrele(Alfabe afbs) {
        StringBuilder sb = new StringBuilder();
        int t = 0;
        int j=afbs.getAlfabe().length();
        for (int i = 0; i < afbs.getGirdi().length(); i++) {
            int X =  afbs.getAlfabe().indexOf(afbs.getKeygen().charAt(t));
            int w = ( afbs.getAlfabe().indexOf(afbs.getGirdi().charAt(i)) + X) %j;     
            sb.append(afbs.getAlfabe().charAt(w));
            t++;
            if (t == afbs.getKeygen().length() ) {
                t = 0;          
            }
           
            afbs.setCikti(sb.toString());
        }
        

    }

    private static void coz(Alfabe afbc) {
        StringBuilder sb2 = new StringBuilder(); 
        int j=afbc.getAlfabe().length();
        int t = 0;
        for (int i = 0; i <afbc.getGirdi().length(); i++) {
            int X =  afbc.getAlfabe().indexOf(afbc.getKeygen().charAt(t));
            int w = (afbc.getAlfabe().indexOf(afbc.getGirdi().charAt(i)) -X) %j;
            if(w<0){
                w+=29; 
            }
            sb2.append(afbc.getAlfabe().charAt(w));
            t++;
            
            if (t ==afbc.getKeygen().length()) {
                t = 0;
            } 
            
        }
        afbc.setCikti(sb2.toString());
    }

}
