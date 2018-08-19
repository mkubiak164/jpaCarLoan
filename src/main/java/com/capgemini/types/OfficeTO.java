package com.capgemini.types;

public class OfficeTO {

    private String adress;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String telephone;
    private String email;

    public OfficeTO() {

    }

    public OfficeTO(String adress, String telephone, String email) {
        this.adress = adress;
        this.telephone = telephone;
        this.email = email;

    }



}
