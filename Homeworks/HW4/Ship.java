/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

/**
 *
 * @author BATIN
 */
public class Ship {
    protected String Name;
    protected String BuildAt;

    public Ship(String Name, String BuildAt) {
        this.Name = Name;
        this.BuildAt = BuildAt;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBuildAt() {
        return BuildAt;
    }

    public void setBuildAt(String BuildAt) {
        this.BuildAt = BuildAt;
    }

    @Override
    public String toString() {
        return String.format("Name: %10s || Build Year:%10s",Name,BuildAt);
    }
    
}
