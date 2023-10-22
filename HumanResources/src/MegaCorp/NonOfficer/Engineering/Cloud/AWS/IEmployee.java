package MegaCorp.NonOfficer.Engineering.Cloud.AWS;

import MegaCorp.NonOfficer.Engineering.Cloud.Categories.Divisions;

public interface IEmployee {
    static final String divisionHRContact = "Jeff Bezos";
    static final Divisions division = Divisions.AWS;
    public void addAWSCert(String cert);
    public void addAWSCerts(String[] certs);
    public void printInfo();
}
