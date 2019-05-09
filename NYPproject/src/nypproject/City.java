package nypproject;

import java.awt.Point;

public class City {

    private String Name;
    private final Point Coordinats = new Point(50, 100);

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Point getCoordinats() {
        return Coordinats;
    }

    public City(String Name, int X, int Y) {
        this.Name = Name;
        Coordinats.x = X;
        Coordinats.y = Y;
    }
}
