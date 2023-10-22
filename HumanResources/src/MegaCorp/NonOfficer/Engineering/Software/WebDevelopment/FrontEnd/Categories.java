package MegaCorp.NonOfficer.Engineering.Software.WebDevelopment.FrontEnd;


import MegaCorp.NonOfficer.Engineering.Software.WebDevelopment.Employee;

import java.util.ArrayList;

public abstract class Categories extends Employee {
    protected ArrayList<String> certifications;

    Categories(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
        this.certifications = new ArrayList<String>();
    }
}
