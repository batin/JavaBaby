
package BatinEryilmaz;

/**
 *
 * @author Batın
 */
class Dikdortgen {
    private double en;
    private double boy;
    private double x;
    private double y;
/**
 * Constructor  
 * @param en
 * @param boy
 * @param x
 * @param y 
 */
    public Dikdortgen(double en, double boy, double x, double y){
        this.en = en;
        this.boy = boy;
        this.x = x;
        this.y = y;
    }

    /*Default Constructor*/
    public Dikdortgen() {
    }
    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        if(en>0)
        this.en = en;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
       if(boy>0)
        this.boy = boy;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    /*----------Methods-------------*/
    public double UpDown(double x) {
        this.x+=x;
        return this.x;
    }
    public double LeftRight(double y) {
        this.y+=y;
         return this.y;
    }
    public void Round(){
        System.out.println("Round= "+(2.0*this.en+2.0*this.boy));
 
    }
    public void Area(){
       System.out.println("Area= "+this.en*this.boy);
    }
    /*------Display------*/
public void Display(){
        System.out.println("X="+this.x+"  Y="+this.y+"  En="+this.en+"  Boy="+this.boy);
    }
}
