package TestPackage;

import MegaCorp.Categories;
import MegaCorp.Officer.CSuite.Employee;

public class CSuiteTest extends RandomTests {

    public CSuiteTest(int seed) {
        super(seed);
    }
    public void test() {
        String[] generalCerts = {"MS-Excel","MS-PowerPoint"};
        String[] CSCerts = {"GAP Accounting","Avoiding Crooked","Swim In Money"};
        String firstName = "Elon" + (rand.nextInt(300) + 2);
        String lastName = "Zuckerberg" + (rand.nextInt(300) + 2);
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
            NewPerson.addCSCert(randomCert("Big Time Corp"));
        }
        NewPerson.addCSCerts(CSCerts);

        NewPerson.updateJobDescription("Do everything possible to rule the world!");
        NewPerson.updateJobTitle("Chief Executive Officer");
        NewPerson.updateEmploymentStatus(Categories.EmploymentStatus.FULLTIME);
        NewPerson.updateRehireEligibility(Categories.Rehire.ELIGIBLE);
        NewPerson.printInfo();
    }
}
