package restaurant;
/**
 *
 * @author BATIN
 */
public class Restaurant {
    
    private String RestaurantName;
    private String Adress;
    private String Owner;
    private boolean []Table;
    private int AvailableTableCount;
    Menu menu=new Menu();
    
    Restaurant(String RestaurantName,String Adress,String Owner,int MasaCount){
        this.RestaurantName=RestaurantName;
        this.Adress=Adress;
        this.Owner=Owner;
        Table=new boolean[MasaCount]; 
        for (boolean status : Table) {
            status=false;//ilk basta hepsi false yani bos
        }
        AvailableTableCount=Table.length;
    }

   
    
    public void setRestaurantName(String RestaurantName){
        this.RestaurantName=RestaurantName;
    }
    public String getRestaurantName(){
        return this.RestaurantName;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public boolean[] getMasa() {
        return Table;
    }

    public void setMasa(boolean[] masa) {
        this.Table = masa;
    }
    
    public void BookTable(int MCount){
       
       if(AvailableTableCount>=MCount){
           for (int i =AvailableTableCount-1; i>= AvailableTableCount-MCount; i--) {
                Table[i]=true;
           }
           AvailableTableCount-=MCount;

           System.out.println("Succeeded");
       }else
            System.out.println("Unfortunately We Don't Have That Much Table \n Available Table Number is:"+AvailableTableCount);
           
    }
    public void ShowMenu(){
        menu.Display();
    }
    public void ShowTables(){
        int i=0;
        for (boolean b : Table) {
            System.out.println("Table"+(++i)+"==="+ b);
        }
    }
    
}
