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
public class Cruise extends Ship {
    private int Capacity;

    public Cruise(int Capacity, String Name, String BuildAt) {
        super(Name, BuildAt);
        this.Capacity = Capacity;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    @Override
    public String toString() {
        return String.format("%s || Capacity : %9s",super.toString(),Capacity);
    }
    
    
}
