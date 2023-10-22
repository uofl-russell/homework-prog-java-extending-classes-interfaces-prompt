package MegaCorp.NonOfficer;

import MegaCorp.Employee;

public abstract class Categories extends Employee {
    public enum Divisions {
        ENGINEERING,
        RESEARCH
    }
    public Categories(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
    }
}
