package MegaCorp.NonOfficer.Engineering.Software.WebDevelopment;


import MegaCorp.NonOfficer.Engineering.Software.Employee;

import java.util.ArrayList;

public abstract class Categories extends Employee {
    public enum Divisions {
        BACKEND,
        FRONTEND
    }
    protected ArrayList<String> certifications;

    protected Categories(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
        this.certifications = new ArrayList<String>();
    }
}
