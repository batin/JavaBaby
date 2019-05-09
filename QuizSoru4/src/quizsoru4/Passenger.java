/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizsoru4;

/**
 *
 * @author BATIN
 */
public class Passenger {
    private String name="";
    private String surname="";
    private String gender="";
    private String Phone="";

    public Passenger(String name, String surname, String gender, String Phone) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.Phone = Phone;
    }

    public Passenger() {
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
    public void Display(){
        if(name!="")
        System.out.println("Name:"+name+"  Surname:"+surname+"  Gender:"+gender+"  Phone Number:"+Phone);
        
    }
    
    
}
