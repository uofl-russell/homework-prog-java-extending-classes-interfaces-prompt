package MegaCorp.NonOfficer.Engineering.Software;

import MegaCorp.NonOfficer.Engineering.Employee;

import java.util.ArrayList;

public abstract class Categories extends Employee {
    public enum Divisions {
        WEBDEVELOPMENT
    }
    protected ArrayList<String> certifications;

    protected Categories(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
        this.certifications = new ArrayList<String>();
    }
}
