package nypproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connections {

    private String kullanici_adi = "root";
    private String parola = "root";

    private String db_ismi = "bato";

    private String host = "localhost";

    private int port = 3306;

    private static Connection con = null;

    private static Statement statement = null;
    private static PreparedStatement preparedStatement = null;

    public Connections() {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi + "?useUnicode=true&characterEncoding=utf8";

        try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        try {
            con = DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("Bağlantı Başarılı...");

        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }

    }

    public static ArrayList<Plane> GetPlanes() {

        ArrayList<Plane> returnn = new ArrayList<>();

        try {
            statement = con.createStatement();
            String sorgu = "Select * From Planes";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                String name = rs.getString("Name");
                String departure = rs.getString("Departure");
                String arrival = rs.getString("Arrival");
                String land = rs.getString("LandingTime");
                String lift = rs.getString("LiftOffTime");
                String date = rs.getString("Date");

                returnn.add(new Plane(name, departure, arrival, land, lift, date));

            }
            return returnn;

        } catch (SQLException ex) {
            Logger.getLogger(Plane.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }
    }

    public static void AddPlane(String name, String departure, String arrival, String Land, String Lift, String Date) {

        try {
            statement = con.createStatement();

            String sorgu = "Insert Into Planes (name,departure,arrival,landingtime,liftofftime,date) "
                    + "VALUES(" + "'" + name + "'," + "'" + departure + "'," + "'" + arrival + "'," + "'" + Lift + "'," + "'" + Land + "'," + "'" + Date + "')";

            statement.executeUpdate(sorgu);

        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void DeletePlane(String name) {

        try {

            statement = con.createStatement();

            String sorgu = "Delete from planes where name = '" + name + "'";

            statement.executeUpdate(sorgu);

        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void EditPlane(String name, String arr, String dp, String lo, String lp, String date) {

        String sorgu = "Update Planes set Departure = ? , Arrival = ? , LandingTime = ? , LiftOffTime = ? , Date = ? where Name = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, dp);
            preparedStatement.setString(2, arr);
            preparedStatement.setString(3, lp);
            preparedStatement.setString(4, lo);
            preparedStatement.setString(5, date);
            preparedStatement.setString(6, name);
            // System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void Register(String nm, String snm, String birth, String adr, String adr2, String mail, String passw) {
        try {
            statement = con.createStatement();

            String sorgu = "Insert Into Accounts (name,surname,birthdate,address,mailingadress,email,password)"
                    + " VALUES(" + "'" + nm + "'," + "'" + snm + "'," + "'" + birth + "'," + "'" + adr + "'," + "'" + adr2 + "'," + "'" + mail + "'," + "'" + passw + "')";

            statement.executeUpdate(sorgu);

        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static boolean Login(String em, String passw) {

        String sorgu = "Select * from accounts where Email = ? and Password = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, em);
            preparedStatement.setString(2, passw);

            ResultSet rs = preparedStatement.executeQuery();

            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    static void AddCity(String name, String coord) {
        try {
            statement = con.createStatement();

            String sorgu = "Insert Into cities (name,coordinates) VALUES(" + "'" + name + "'," + "'" + coord + "')";

            statement.executeUpdate(sorgu);

        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<City> GetCities() {

        ArrayList<City> returnn = new ArrayList<>();

        try {
            statement = con.createStatement();
            String sorgu = "Select * From Cities";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                String name = rs.getString("Name");
                String coord = rs.getString("Coordinates");
                String[] s = coord.split(",");
                int x = Integer.parseInt(s[0]);
                int y = Integer.parseInt(s[1]);
                returnn.add(new City(name, x, y));

            }
            return returnn;

        } catch (SQLException ex) {
            Logger.getLogger(Plane.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    static String CalculatePrice(String arrival, String departure) {

        int x = 0, x2 = 0, y = 0, y2 = 0;

        String sorgu = "Select * From Cities where Name like '%" + arrival.toUpperCase() + "%' ";
        String sorgu2 = "Select * From Cities where Name like '%" + departure.toUpperCase() + "%' ";

        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            while (rs.next()) {
                String coord = rs.getString("Coordinates");
                String[] s = coord.split(",");
                x = Integer.parseInt(s[0]);
                y = Integer.parseInt(s[1]);
            }
            ResultSet rs2 = statement.executeQuery(sorgu2);
            while (rs2.next()) {
                String coord2 = rs2.getString("Coordinates");
                String[] s2 = coord2.split(",");
                x2 = Integer.parseInt(s2[0]);
                y2 = Integer.parseInt(s2[1]);
            }
            System.out.println(x);
            System.out.println(x2);
            System.out.println(y);
            System.out.println(y2);
            double price = Math.sqrt((x - x2 + y - y2) * (x - x2 + y - y2)) * 1.8;

            return "" + price;

        } catch (SQLException ex) {
            Logger.getLogger(Plane.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<Plane> GetSelectedPlanes(String Dp, String Ar, String Date) {

        ArrayList<Plane> returnn = new ArrayList<>();

        try {
            statement = con.createStatement();
            String sorgu = "Select * From Planes where Departure ='" + Dp + "' And Arrival = '" + Ar + "'" + " And Date = '" + Date + "'";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                String name = rs.getString("Name");
                String departure = rs.getString("Departure");
                String arrival = rs.getString("Arrival");
                String land = rs.getString("LandingTime");
                String lift = rs.getString("LiftOffTime");
                String date = rs.getString("Date");

                returnn.add(new Plane(name, departure, arrival, land, lift, date));

            }
            return returnn;

        } catch (SQLException ex) {
            Logger.getLogger(Plane.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }
    }

    static void R_info(String nm, String snm, String birth, String adr, String adr2, String mail, String plane, String seat) {
        try {
            statement = con.createStatement();

            String sorgu = "Insert Into Passengers (name,surname,birthdate,adress,mailingadress,email,plane,seat) "
                    + "VALUES(" + "'" + nm + "'," + "'" + snm + "'," + "'" + birth + "'," + "'" + adr + "'," + "'" + adr2 + "'," + "'" + mail + "'," + "'" + plane + "'," + "'" + seat + "')";

            statement.executeUpdate(sorgu);

        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static ArrayList<Passenger> GetPassengers() {
        ArrayList<Passenger> returnn = new ArrayList<>();
        try {
            statement = con.createStatement();
            String sorgu = "Select * From Passengers";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                String Name = rs.getString("Name");
                String Surname = rs.getString("Surname");
                String Birthdate = rs.getString("Birthdate");
                String Adress = rs.getString("Adress");
                String MailingAdress = rs.getString("MailingAdress");
                String eMail = rs.getString("eMail");
                String PlaneName = rs.getString("Plane");
                String Seat = rs.getString("Seat");

                returnn.add(new Passenger(Name, Surname, Birthdate, Adress, MailingAdress, eMail, PlaneName, Seat));

            }
            return returnn;

        } catch (SQLException ex) {
            Logger.getLogger(Plane.class
                    .getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    static ArrayList<Account> GetAccounts() {
        ArrayList<Account> returnn = new ArrayList<>();
        try {
            statement = con.createStatement();
            String sorgu = "Select * From Accounts";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int Id = rs.getInt("Id");
                String Name = rs.getString("Name");
                String Surname = rs.getString("Surname");
                String Birthdate = rs.getString("Birthdate");
                String Adress = rs.getString("Address");
                String MailingAdress = rs.getString("MailingAdress");
                String eMail = rs.getString("eMail");
                String Pass = rs.getString("Password");

                returnn.add(new Account(Id, Name, Surname, Birthdate, Adress, MailingAdress, eMail, Pass));

            }
            return returnn;

        } catch (SQLException ex) {
            Logger.getLogger(Plane.class
                    .getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static void DeleteAccount(int id) {

        try {

            statement = con.createStatement();

            String sorgu = "Delete from accounts where id = '" + id + "'";

            statement.executeUpdate(sorgu);

        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static ArrayList<Ticket> GetTickets(String eMail) {
        ArrayList<Ticket> returnn = new ArrayList<>();
        try {
            statement = con.createStatement();
            String sorgu = "SELECT passengers.Plane,passengers.Seat,passengers.eMail,planes.Departure,planes.Arrival,planes.LiftOffTime,planes.LandingTime,"
                    + "planes.Date FROM passengers,planes WHERE planes.Name = passengers.Plane AND passengers.eMail = '" + eMail + "'";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                String PlaneName = rs.getString("Plane");
                String Seat = rs.getString("Seat");
                String Departure = rs.getString("Departure");
                String Arrival = rs.getString("Arrival");
                String LandingTime = rs.getString("LandingTime");
                String LiftOffTime = rs.getString("LiftOffTime");
                String Date = rs.getString("Date");

                returnn.add(new Ticket(PlaneName, Seat, Departure, Arrival, LandingTime, LiftOffTime, Date));

            }
            return returnn;

        } catch (SQLException ex) {
            Logger.getLogger(Plane.class
                    .getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    static void DeleteTicket(String PlaneName, String Seat) {

        try {

            statement = con.createStatement();

            String sorgu = "Delete from passengers where plane = '" + PlaneName + "'and seat = '" + Seat + "'";

            statement.executeUpdate(sorgu);

        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static ArrayList<Ticket> GetAllTickets() {
        ArrayList<Ticket> returnn = new ArrayList<>();
        try {
            statement = con.createStatement();
            String sorgu = "SELECT passengers.Plane, passengers.Seat, passengers.Name,passengers.Surname, planes.Departure, planes.Arrival, planes.LiftOffTime, planes.LandingTime, planes.Date "
                    + " FROM passengers "
                    + "INNER JOIN planes ON planes.Name = passengers.Plane";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                String PlaneName = rs.getString("Plane");
                String Seat = rs.getString("Seat");
                String Name = rs.getString("Name");
                String Surame = rs.getString("Surname");
                String Departure = rs.getString("Departure");
                String Arrival = rs.getString("Arrival");
                String LandingTime = rs.getString("LandingTime");
                String LiftOffTime = rs.getString("LiftOffTime");
                String Date = rs.getString("Date");

                returnn.add(new Ticket(PlaneName, Seat, Name, Surame, Departure, Arrival, LandingTime, LiftOffTime, Date));

            }
            return returnn;

        } catch (SQLException ex) {
            Logger.getLogger(Plane.class
                    .getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
