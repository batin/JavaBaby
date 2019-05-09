
package BatinEryilmaz;

/**
 *YAPIYO BISILER :}
 * @author Batın
 */
public class Alfabe {

    
    private String alfabe="";
    private String Keygen="";
    private String Girdi="";
    private String cikti="";

    public Alfabe(String alfabe,String Keygen) {
    this.alfabe=alfabe;
    this.Keygen=Keygen;
    }
    
    public String getGirdi() {
        return Girdi;
    }

    public void setGirdi(String Girdi) {
        this.Girdi = Girdi;
    }
    public String getAlfabe() {
        return alfabe;
    }

    public void setAlfabe(String alfabe) {
        this.alfabe = alfabe;
    }

    public String getCikti() {
        return cikti;
    }

    public void setCikti(String cikti) {
        this.cikti = cikti;
    }

    public String getKeygen() {
        return Keygen;
    }

    public void setKeygen(String Keygen) {
        this.Keygen = Keygen;
    }

    public void CiktiYazdir() {
        System.out.println("Cikti:"+cikti);
    }
    
    
}