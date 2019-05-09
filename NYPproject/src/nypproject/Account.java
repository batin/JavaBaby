package nypproject;

public class Account {

    private int Id;
    private String Name;
    private String Surname;
    private String Birthdate;
    private String Adress;
    private String MailingAdress;
    private String eMail;
    private String Password;

    public Account(int Id, String Name, String Surname, String Birthdate, String Adress, String MailingAdress, String eMail, String Password) {
        this.Id = Id;
        this.Name = Name;
        this.Surname = Surname;
        this.Birthdate = Birthdate;
        this.Adress = Adress;
        this.MailingAdress = MailingAdress;
        this.eMail = eMail;
        this.Password = Password;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String Birthdate) {
        this.Birthdate = Birthdate;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public String getMailingAdress() {
        return MailingAdress;
    }

    public void setMailingAdress(String MailingAdress) {
        this.MailingAdress = MailingAdress;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
