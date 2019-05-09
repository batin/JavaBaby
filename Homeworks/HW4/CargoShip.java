
package P2;

/**
 *
 * @author BATIN
 */
public class CargoShip extends Ship{
    private int MaxWeight;

    public CargoShip(int MaxWeight, String Name, String BuildAt) {
        super(Name, BuildAt);
        this.MaxWeight = MaxWeight;
    }

    public int getMaxWeight() {
        return MaxWeight;
    }

    public void setMaxWeight(int MaxWeight) {
        this.MaxWeight = MaxWeight;
    }

    @Override
    public String toString() {
       
        return String.format("%s || Maximum Wight: %5s",super.toString(),MaxWeight);
    }

    
    
}
