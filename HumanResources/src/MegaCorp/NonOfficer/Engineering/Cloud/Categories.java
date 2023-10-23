package MegaCorp.NonOfficer.Engineering.Cloud;

import MegaCorp.NonOfficer.Engineering.Employee;

import java.util.ArrayList;

public abstract class Categories extends Employee {
    public enum Divisions {
        AWS,
        AZURE
    }
    protected ArrayList<String> certifications;

    Categories(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
        this.certifications = new ArrayList<String>();
    }
}