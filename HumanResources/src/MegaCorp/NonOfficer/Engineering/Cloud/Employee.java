package MegaCorp.NonOfficer.Engineering.Cloud;

import java.util.Collections;


public abstract class Employee extends Categories implements IEmployee {

    protected Employee(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
    }

    public void addCloudCert(String cert) {
        certifications.add(cert);
    }

    public void addCloudCerts(String[] certs) {
        Collections.addAll(this.certifications, certs);
    }

    protected String buildCertifications() {
        StringBuilder certStringBuilder = new StringBuilder(super.buildCertifications());
        certStringBuilder.append("\n\t\tCloud Certifications : ");
        for (String cert : certifications) {
            certStringBuilder.append("\n\t\t\t").append(cert);
        }
        return certStringBuilder.toString();
    }
    protected String buildHRChain() {
        return super.getDivisionContactString(IEmployee.division.toString(), IEmployee.divisionHRContact) + super.buildHRChain();
    }

    public void printInfo(String hrChain, String certs) {
        super.printInfo(buildHRChain(), buildCertifications());
    }
}
