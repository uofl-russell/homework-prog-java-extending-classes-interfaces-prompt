package MegaCorp.NonOfficer.Engineering;

import java.util.Collections;


public abstract class Employee extends Categories implements IEmployee {

    protected Employee(String firstName, String lastName, int employeeID) {
        super(firstName, lastName, employeeID);
    }

    public void addEngineerCert(String cert) {
        certifications.add(cert);
    }

    public void addEngineerCerts(String[] certs) {
        Collections.addAll(this.certifications, certs);
    }

    protected String buildHRChain() {
        return super.getDivisionContactString(IEmployee.division.toString(), IEmployee.divisionHRContact) + super.buildHRChain();
    }
    protected String buildCertifications() {
        StringBuilder certStringBuilder = new StringBuilder(super.buildCertifications());
        certStringBuilder.append("\n\t\tEngineering Certifications : ");
        for (String cert : certifications) {
            certStringBuilder.append("\n\t\t\t").append(cert);
        }
        return certStringBuilder.toString();
    }

    public void printInfo(String hrChain, String certs) {
        super.printInfo(buildHRChain(), buildCertifications());
    }
}
