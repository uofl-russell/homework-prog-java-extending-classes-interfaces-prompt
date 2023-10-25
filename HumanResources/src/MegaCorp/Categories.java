package MegaCorp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public abstract class Categories {
    public enum EmploymentStatus {
        INTERN,
        PARTTIME,
        FULLTIME,
        RETIRED,
        TERMINATED,
        UNKNOWN
    }
    public enum Rehire {
        NOTELIGIBLE,
        ELIGIBLE
    }
    public enum Divisions {
        OFFICER,
        NONOFFICER
    }
    protected final String firstName;
    protected final String lastName;
    protected final int employeeID;
    protected Calendar hireDate;
    protected Calendar birthDate;
    protected ArrayList<String> certifications;
    protected EmploymentStatus employmentStatus = EmploymentStatus.UNKNOWN;
    protected Divisions division;
    protected String jobTitle;
    protected Rehire rehireEligibility;
    protected String jobDescription;

    protected Categories(String firstName, String lastName, int employeeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.certifications = new ArrayList<String>();
    }
}
