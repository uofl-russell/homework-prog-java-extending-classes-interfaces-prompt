package MegaCorp.Officer.CSuite;

import java.util.Collections;


public class Employee extends Categories implements IEmployee {

    public Employee(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
    }

    public void addCSCert(String cert) {
        certifications.add(cert);
    }

    public void addCSCerts(String[] certs) {
        Collections.addAll(this.certifications, certs);
    }

    protected String buildHRChain() {
        return super.getDivisionContactString(IEmployee.division.toString(), IEmployee.divisionHRContact) + super.buildHRChain();
    }
    protected String buildCertifications() {
        StringBuilder certStringBuilder = new StringBuilder(super.buildCertifications());
        certStringBuilder.append("\n\t\tCSUITE Certifications : ");
        for (String cert : certifications) {
            certStringBuilder.append("\n\t\t\t").append(cert);
        }
        return certStringBuilder.toString();
    }

    public void printInfo() {
        super.printInfo(buildHRChain(), buildCertifications());
    }
}
