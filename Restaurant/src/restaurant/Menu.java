package restaurant;
/**
 *
 * @author BATIN
 */
public class Menu {
   private String [][] Dinner=new String[10][2];
   private String [][] Soups=new String[10][2];
   private String [][] Starters=new String[10][2];
        
    public Menu(){
        for (int i = 0; i < 10; i++) {
            Dinner[i][1]=((i+3)*5)+"Tl";
            Soups[i][1]=((i+1)*5)+"Tl";
            Starters[i][1]=((i+2)*5)+"Tl";
            
            Dinner[i][0]="Dinner"+(i+1);
            Soups[i][0]="Soup"+(i+1);
            Starters[i][0]="Starters"+(i+1);
            
        }
        //urunlerin fiyatlari ve isimlerini hizli bi sekilde yazmak amaciyla yapilmistir.
    }
    
    public String[][] getDinner() {
        return Dinner;
    }

    public void setDinner(String[][] Dinner) {
        this.Dinner = Dinner;
    }

    public String[][] getSoops() {
        return Soups;
    }

    public void setSoops(String[][] Soups) {
        this.Soups = Soups;
    }

    public String[][] getStarters() {
        return Starters;
    }

    public void setStarters(String[][] Starters) {
        this.Starters = Starters;
    }
   
    
    public void Display(){
        for (int i = 0; i < 10; i++) {
                System.out.println(Dinner[i][0]+"====>"+Dinner[i][1]);
        }
        for (int i = 0; i < 10; i++) {
                System.out.println(Soups[i][0]+"====>"+Soups[i][1]);
        }
        for (int i = 0; i < 10; i++) {
                System.out.println(Starters[i][0]+"====>"+Starters[i][1]);
        }
        
    }
    
}
