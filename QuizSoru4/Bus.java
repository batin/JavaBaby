package quizsoru4;

import java.util.Scanner;

/**
 *
 * @author BATIN
 */
public class Bus {
    private String plate;
    private int seatCount;
    Seat[] seats;
    
    Scanner sc = new Scanner(System.in);
    
    
    public Bus(String plate, int seatCount) {
        this.plate = plate;
        this.seatCount = seatCount;
        seats=new Seat[seatCount];
        for (int i = 0; i < seatCount; i++) {
            seats[i]=new Seat(i+1);
        }
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    
    
    public void bookSeat(int seatID){
        System.out.println("Name:");
        String name=sc.nextLine();
       // p.setName(name);
        System.out.println("Surname:");
        String surname=sc.nextLine();
       // p.setSurname(surname);
        System.out.println("Gender:");
        String gndr=sc.nextLine();
        //p.setGender(gndr);
        System.out.println("Phone Number:");
        String phn=sc.nextLine();
        //p.setPhone(phn);
        Passenger p=new Passenger(name,surname,gndr,phn);
        seats[seatID].setP(p);
        seats[seatID].setS();
    }
    
    public void printAllPassengers(){
        for (Seat seat : seats) {
            Passenger p = seat.getP();
            p.Display();
        }
        
    }
    public void printAllid(){
        for (Seat seat : seats) {
            seat.Display();
        }
        
    }
    
    public void search(){
        System.out.println("isim giriniz");
        String name=sc.nextLine();
        int count=0;
        for (Seat seat : seats) {
            if(name.equals( seat.getP().getName() )){
                seat.getP().Display();
                count++;
            }
        }
        if(count==0)
                System.out.println("bulunamadi");
        
    }
    
    public void findSeat(){
        System.out.println("Koltuk num giriniz");
    int num=sc.nextInt();
    if(seats[num].getP().getName()!=""){
    seats[num].getP().Display();
    
    }else{
        System.out.println("bulunamadi");
    }
        
    
    }
    
    
    
}