
package javalabclass;

public class karmasik {
    private double real;
    private double imaginer;
    
    public karmasik(double real,double imaginer){
        this.real=real;
        this.imaginer=imaginer;
    }
 public karmasik(){
     
 }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
      // if(real>0)
        this.real = real;
    }

    public double getImaginer() {
        return imaginer;
    }

    public void setImaginer(double imaginer) {
        this.imaginer = imaginer;
    }
  

    public void add(karmasik x){
        setReal(real+x.real);
        imaginer+=x.imaginer;
    }
    public void minus(karmasik x){
        setReal(real-x.real);
        setImaginer(imaginer-x.imaginer);
    }
    public void mutliply(karmasik x){
    double a=0;    
    a=real*x.real-imaginer*x.imaginer;
            setImaginer(real*x.imaginer+imaginer*x.real);
          setReal(a);

    }
    public void display()
    {
    System.out.println("Real:"+real+"\t imaginer"+imaginer);    
    }
}
