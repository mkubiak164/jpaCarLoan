package com.capgemini.types;

import java.util.Date;

public class EmployeeTO {


    private String name;
    private String lastName;
    private Date dateOfBirth;

    public EmployeeTO() {

    }

    public EmployeeTO(String name, String lastName, Date dateOfBirth) {

        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }







}
