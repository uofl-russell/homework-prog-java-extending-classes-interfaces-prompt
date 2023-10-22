package MegaCorp.NonOfficer.Engineering.Cloud.Azure;


import MegaCorp.NonOfficer.Engineering.Cloud.Employee;

import java.util.ArrayList;

public abstract class Categories extends Employee {
    protected ArrayList<String> certifications;

    Categories(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
        this.certifications = new ArrayList<String>();
    }
}
