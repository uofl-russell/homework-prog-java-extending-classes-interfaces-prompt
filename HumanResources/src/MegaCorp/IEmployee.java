package MegaCorp;

import java.util.Calendar;

public interface IEmployee {

    static final String divisionHRContact = "Melinda Bigmoney";
    static final String divisionName = "MegaCorp";
    public void addGeneralCert(String cert);
    public void addGeneralCerts(String[] certs);
    public void updateBirthDate(Calendar birthDate);
    public void updateJobTitle(String jobTitle);
    public void updateHireDate(Calendar hireDate);
    public void updateJobDescription(String jobDescription);
    public void updateEmploymentStatus(Categories.EmploymentStatus employmentStatus);
    public void printInfo(String hrChain, String certs);



}