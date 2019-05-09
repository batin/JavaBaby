package nypproject;

public class Ticket {

    private String PlaneName;
    private String Seat;
    private String Name;
    private String Surname;
    private String Departure;
    private String Arrival;
    private String LandingTime;
    private String LiftOffTime;
    private String Date;

    public Ticket(String PlaneName, String Seat, String Name, String Surname, String Departure, String Arrival, String LandingTime, String LiftOffTime, String Date) {
        this.PlaneName = PlaneName;
        this.Seat = Seat;
        this.Name = Name;
        this.Surname = Surname;
        this.Departure = Departure;
        this.Arrival = Arrival;
        this.LandingTime = LandingTime;
        this.LiftOffTime = LiftOffTime;
        this.Date = Date;
    }

    public Ticket(String PlaneName, String Seat, String Departure, String Arrival, String LandingTime, String LiftOffTime, String Date) {
        this.PlaneName = PlaneName;
        this.Seat = Seat;
        this.Departure = Departure;
        this.Arrival = Arrival;
        this.LandingTime = LandingTime;
        this.LiftOffTime = LiftOffTime;
        this.Date = Date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getPlaneName() {
        return PlaneName;
    }

    public void setPlaneName(String PlaneName) {
        this.PlaneName = PlaneName;
    }

    public String getSeat() {
        return Seat;
    }

    public void setSeat(String Seat) {
        this.Seat = Seat;
    }

    public String getDeparture() {
        return Departure;
    }

    public void setDeparture(String Departure) {
        this.Departure = Departure;
    }

    public String getArrival() {
        return Arrival;
    }

    public void setArrival(String Arrival) {
        this.Arrival = Arrival;
    }

    public String getLandingTime() {
        return LandingTime;
    }

    public void setLandingTime(String LandingTime) {
        this.LandingTime = LandingTime;
    }

    public String getLiftOffTime() {
        return LiftOffTime;
    }

    public void setLiftOffTime(String LiftOffTime) {
        this.LiftOffTime = LiftOffTime;
    }

}
