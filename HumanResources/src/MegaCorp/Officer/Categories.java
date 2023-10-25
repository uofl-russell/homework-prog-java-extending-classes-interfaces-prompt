package MegaCorp.Officer;

import MegaCorp.Employee;

public abstract class Categories extends Employee {
    public enum Divisions {
        CSUITE
    }
    protected Categories(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
    }
}
