package TestPackage;

import MegaCorp.NonOfficer.Engineering.Software.WebDevelopment.FrontEnd.Employee;

public class FETest extends RandomTests {

    public FETest(int seed) {
        super(seed);
    }
    public void test() {
        String[] generalCerts = {"MS-Excel","MS-PowerPoint"};
        String[] engCerts = {"Manufacturing Safety","OHSHA"};
        String[] softwareCerts = {"Python","C++","C","Haskell","Java"};
        String[] webCerts = {"ServiceWorkers","WebSockets","HTTPS"};
        String[] feCerts = {"React","Angular"};
        String firstName = "Kendall" + (rand.nextInt(300) + 2);
        String lastName = "Smith" + (rand.nextInt(300) + 2);
        int employeeID = rand.nextInt(5000)+5000;
        Employee NewPerson = new Employee(firstName,lastName,employeeID );
        for (int i=0; i<rand.nextInt(5); i++) {
            NewPerson.addGeneralCert(randomCert("General"));
        }
        NewPerson.addGeneralCerts(generalCerts);
        for (int i=0; i<rand.nextInt(5); i++) {
            NewPerson.addGeneralCert(randomCert("General"));
        }
        NewPerson.updateBirthDate(randomBirthDate());
        NewPerson.updateHireDate(randomHireDate());
        for (int i=0; i<rand.nextInt(5); i++) {
            NewPerson.addWebCert(randomCert("Web"));
        }
        NewPerson.addWebCert("MySQL");
        for (int i=0; i<rand.nextInt(5); i++) {
            NewPerson.addWebCert(randomCert("Web"));
        }
        NewPerson.addFECerts(feCerts);
        for (int i=0; i<rand.nextInt(5); i++) {
            NewPerson.addFECert(randomCert("FE"));
        }
        NewPerson.addWebCerts(webCerts);
        NewPerson.addSoftwareCert("Clingo");
        for (int i=0; i<rand.nextInt(5); i++) {
            NewPerson.addSoftwareCert(randomCert("Software"));
        }
        NewPerson.addSoftwareCerts(softwareCerts);

        NewPerson.addGeneralCert("Caregiving");
        NewPerson.addEngineerCert("Chemical Safety");
        for (int i=0; i<rand.nextInt(5); i++) {
            NewPerson.addEngineerCert(randomCert("Engineer"));
        }
        NewPerson.addEngineerCerts(engCerts);
        NewPerson.updateJobDescription(randomJobDescription());
        NewPerson.updateJobTitle(randomJobTitle());
        NewPerson.updateEmploymentStatus(randomEmploymentStatus());
        NewPerson.updateRehireEligibility(randomRehireStatus());
        NewPerson.printInfo();
    }
}
