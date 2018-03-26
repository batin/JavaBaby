
package quizsoru4;

/**
 *
 * @author BATIN
 */
public class Seat {
    Passenger p=new Passenger();
    private int seatID;
    private enum status{
        BOS,
        DOLU
    };
    status s;

    public Seat(int seatID) {
        this.seatID = seatID;
        s = status.BOS; 
   }
    
    public status getS() {
        return s;
    }

    public void setS() {
       s = status.DOLU;
    }

    public Passenger getP() {
        return p;
    }

    public void setP(Passenger p) {
        this.p = p;
    }
    
    public int getSeatID() {
        return seatID;
    }

    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }

    

   
    public void Display(){
        if(seatID<10)
        System.out.println("Seat ID:"+seatID+"  Status:  "+s);
        else
        System.out.println("Seat ID:"+seatID+" Status:  "+s);
        
    }

   
    
}
