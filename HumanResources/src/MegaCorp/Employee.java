package MegaCorp;

import java.util.Calendar;
import java.util.Collections;

public abstract class Employee extends Categories implements IEmployee {

    protected Employee(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
    }

    public void addGeneralCert(String cert) {
        certifications.add(cert);
    }

    public void addGeneralCerts(String[] certs) {
        Collections.addAll(this.certifications, certs);
    }

    public void updateBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public void updateHireDate(Calendar hireDate) {
        this.hireDate = hireDate;
    }
    public void updateJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void updateJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void updateRehireEligibility(Rehire rehireStatus) {
        this.rehireEligibility = rehireStatus;
    }
    public void updateEmploymentStatus(EmploymentStatus employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    protected String buildCertifications() {
        StringBuilder certStringBuilder = new StringBuilder("\tAll Certifications Listed Below : ");
        certStringBuilder.append("\n\t\tGeneral Certifications : ");
        for (String cert : certifications) {
            certStringBuilder.append("\n\t\t\t").append(cert);
        }
        return certStringBuilder.toString();
    }

    protected String getDivisionContactString(String division, String hrContact) {
        return "\n\t\t"
            + division
            + " => "
            + hrContact;
    }

    protected String buildHRChain() {
        return getDivisionContactString(divisionName, divisionHRContact);
    }
    private String formatDate(Calendar date) {
        return (date.get(Calendar.MONTH) + 1) + "/" + date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.YEAR);
    }
    public void printInfo(String hrChain, String certs) {
        System.out.println("\n---------Begin Employee Record------------\n");
        System.out.println("\tEmployee Name : " + firstName + " " + lastName);
        System.out.println("\tBirth Date : " + formatDate(birthDate));
        System.out.println("\tEmployee ID : " + employeeID);
        System.out.println("\tHire Date : " + formatDate(hireDate));
        System.out.println("\tJob Title : " + jobTitle);
        System.out.println("\tEmployment Status : " + employmentStatus);
        System.out.println("\tRehire Eligibility : " + rehireEligibility);
        System.out.println("\tEmployee HR Chain Of Command Listed Below (Division => Contact) : "  + hrChain);
        System.out.println(certs);
        System.out.println("\tJob Description Given Below : ");
        System.out.println("\t\t" + jobDescription);
        System.out.println("\n---------End Employee Record------------\n");

    }
}
