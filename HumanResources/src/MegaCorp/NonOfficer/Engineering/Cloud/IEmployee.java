package MegaCorp.NonOfficer.Engineering.Cloud;

import MegaCorp.NonOfficer.Engineering.Categories.Divisions;

public interface IEmployee {
    static final String divisionHRContact = "Samantha Cloud";
    static final Divisions division = Divisions.CLOUD;
    public void addCloudCert(String cert);
    public void addCloudCerts(String[] certs);
    public void printInfo(String hrChain, String certs);
}
