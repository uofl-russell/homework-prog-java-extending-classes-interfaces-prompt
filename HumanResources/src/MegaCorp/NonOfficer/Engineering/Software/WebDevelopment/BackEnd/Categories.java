package MegaCorp.NonOfficer.Engineering.Software.WebDevelopment.BackEnd;


import MegaCorp.NonOfficer.Engineering.Software.WebDevelopment.Employee;

import java.util.ArrayList;

public abstract class Categories extends Employee {
    protected ArrayList<String> certifications;

    protected Categories(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
        this.certifications = new ArrayList<String>();
    }
}
