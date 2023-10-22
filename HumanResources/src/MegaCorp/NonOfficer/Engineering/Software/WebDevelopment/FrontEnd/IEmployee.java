package MegaCorp.NonOfficer.Engineering.Software.WebDevelopment.FrontEnd;

import MegaCorp.NonOfficer.Engineering.Software.WebDevelopment.Categories.Divisions;

public interface IEmployee {
    static final String divisionHRContact = "Alanis Front";
    static final Divisions division = Divisions.FRONTEND;
    public void addFECert(String cert);
    public void addFECerts(String[] certs);
    public void printInfo();
}
