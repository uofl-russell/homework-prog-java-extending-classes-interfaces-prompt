package TestPackage;

import MegaCorp.NonOfficer.Engineering.Cloud.Azure.Employee;

public class AzureTest extends RandomTests {

    public AzureTest(int seed) {
        super(seed);
    }
    public void test() {
        String[] generalCerts = {"MS-Excel","MS-PowerPoint"};
        String[] engCerts = {"Manufacturing Safety","OHSHA"};
        String[] cloudCerts = {"Cisco","Google Cloud", "Cloud Plus"};
        String[] azureCerts = {"AZDevOps", "ASA", "MSSQL"};
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
            NewPerson.addCloudCert(randomCert("Cloud"));
        }
        NewPerson.addCloudCert("BigCloud One");
        for (int i=0; i<rand.nextInt(5); i++) {
            NewPerson.addCloudCert(randomCert("Cloud"));
        }
        NewPerson.addCloudCerts(cloudCerts);
        NewPerson.addAzureCerts(azureCerts);
        for (int i=0; i<rand.nextInt(5); i++) {
            NewPerson.addAzureCert(randomCert("Azure"));
        }

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
