package TestPackage;

import MegaCorp.NonOfficer.Research.Employee;

public class ResearchTest extends RandomTests {

    public ResearchTest(int seed) {
        super(seed);
    }
    public void test() {
        String[] generalCerts = {"MS-Excel","MS-PowerPoint"};
        String[] researchCerts = {"Smart 100", "Top 50", "IEEE Fellow"};
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
            NewPerson.addResearchCert(randomCert("Research"));
        }
        NewPerson.addResearchCert("Nobel Prize");
        NewPerson.addResearchCerts(researchCerts);
        for (int i=0; i<rand.nextInt(5); i++) {
            NewPerson.addResearchCert(randomCert("Research"));
        }
        NewPerson.updateJobDescription(randomJobDescription());
        NewPerson.updateJobTitle(randomJobTitle());
        NewPerson.updateEmploymentStatus(randomEmploymentStatus());
        NewPerson.updateRehireEligibility(randomRehireStatus());
        NewPerson.printInfo();
    }
}
