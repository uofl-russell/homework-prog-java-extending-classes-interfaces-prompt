package MegaCorp.NonOfficer.Engineering;

import MegaCorp.NonOfficer.Categories.Divisions;

public interface IEmployee {
    static final String divisionHRContact = "Mahsa Bigengine";
    static final Divisions division = Divisions.ENGINEERING;

    public void addEngineerCert(String cert);
    public void addEngineerCerts(String[] certs);
    public void printInfo(String hrChain, String certs);
}
