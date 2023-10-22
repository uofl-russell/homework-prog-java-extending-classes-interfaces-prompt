package MegaCorp.NonOfficer.Research;

import MegaCorp.NonOfficer.Categories.Divisions;

public interface IEmployee {
    static final String divisionHRContact = "Madison Resear";
    static final Divisions division = Divisions.RESEARCH;

    public void addResearchCert(String cert);
    public void addResearchCerts(String[] certs);
    public void printInfo();
}
