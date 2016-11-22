package com.BankEmployees;

/**
 * Created by kellie on 11/21/16.
 */
public class BankEmployees {

    private String firstName;
    private String lastName;
    private boolean isExempt;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isExempt() {
        return isExempt;
    }

    public void setExempt(boolean exempt) {
        isExempt = exempt;
    }

    public BankEmployees(String firstName, String lastName, boolean isExempt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isExempt = isExempt;
    }



}
