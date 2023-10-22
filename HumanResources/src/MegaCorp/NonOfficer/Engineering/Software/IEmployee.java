package MegaCorp.NonOfficer.Engineering.Software;

import MegaCorp.NonOfficer.Engineering.Categories.Divisions;

public interface IEmployee {
    static final String divisionHRContact = "Larry Soft";
    static final Divisions division = Divisions.SOFTWARE;
    public void addSoftwareCert(String cert);
    public void addSoftwareCerts(String[] certs);
    public void printInfo(String hrChain, String certs);
}
