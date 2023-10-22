package MegaCorp.Officer.CSuite;

import MegaCorp.Officer.Categories.Divisions;

public interface IEmployee {
    static final String divisionHRContact = "Unreachable Jim";
    static final Divisions division = Divisions.CSUITE;

    public void addCSCert(String cert);
    public void addCSCerts(String[] certs);
    public void printInfo();
}
