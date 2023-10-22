package MegaCorp.NonOfficer.Engineering.Software.WebDevelopment.BackEnd;

import MegaCorp.NonOfficer.Engineering.Software.WebDevelopment.Categories.Divisions;

public interface IEmployee {
    static final String divisionHRContact = "Alan Back";
    static final Divisions division = Divisions.BACKEND;
    public void addBECert(String cert);
    public void addBECerts(String[] certs);
    public void printInfo();
}
