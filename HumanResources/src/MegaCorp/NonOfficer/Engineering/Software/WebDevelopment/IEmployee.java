package MegaCorp.NonOfficer.Engineering.Software.WebDevelopment;

import MegaCorp.NonOfficer.Engineering.Software.Categories.Divisions;

public interface IEmployee {
    static final String divisionHRContact = "Chelsay Web";
    static final Divisions division = Divisions.WEBDEVELOPMENT;
    public void addWebCert(String cert);
    public void addWebCerts(String[] certs);
    public void printInfo(String hrChain, String certs);
}
