package MegaCorp.NonOfficer.Engineering.Cloud.Azure;

import MegaCorp.NonOfficer.Engineering.Cloud.Categories.Divisions;

public interface IEmployee {
    static final String divisionHRContact = "Bill Gates";
    static final Divisions division = Divisions.AZURE;
    public void addAzureCert(String cert);
    public void addAzureCerts(String[] certs);
    public void printInfo();
}
