package TestPackage;

import MegaCorp.Categories;

import java.util.Calendar;
import java.util.Random;

public abstract class RandomTests {
    protected Random rand;

    public RandomTests(int seed) {
        rand = new Random(seed);
    }
    protected String randomCert(String category) {
        return category + " Cert #" + rand.nextInt(800);
    }

    protected String randomJobDescription() {
        int label = rand.nextInt(500)%2;
        switch (label) {
            case 0:
                return "Leads a team of "
                            + (10 + rand.nextInt(100))
                            + " that develop Web Applications for section "
                            + rand.nextInt(50000);
            case 1:
                return "General supervisor for a team of "
                            + (10 + rand.nextInt(100))
                            + " that design projects for section "
                            + rand.nextInt(50000);
            default:
                return "Employee wanders aimlessly.  No idea how this happened.";
        }
    }

    protected String randomJobTitle() {
        int label = rand.nextInt(500)%3;
        switch (label) {
            case 0:
                return "Senior Lead For Project #" + rand.nextInt(500);
            case 1:
                return "Scrum Master For Project #" + rand.nextInt(500);
            case 2:
                return "Admin Assistant For Project #" + rand.nextInt(500);
            default:
                return "Employee has not official title.  No  Idea how this happened";
        }
    }

    protected Categories.EmploymentStatus randomEmploymentStatus() {
        int label = rand.nextInt(500)%5;
        switch (label) {
            case 0:
                return Categories.EmploymentStatus.FULLTIME;
            case 1:
                return Categories.EmploymentStatus.PARTTIME;
            case 2:
                return Categories.EmploymentStatus.INTERN;
            case 3:
                return Categories.EmploymentStatus.RETIRED;
            case 4:
                return Categories.EmploymentStatus.TERMINATED;
            default:
                return Categories.EmploymentStatus.UNKNOWN;
        }
    }
    protected Categories.Rehire randomRehireStatus() {
        int label = rand.nextInt(500)%2;
        switch (label) {
            case 0:
                return Categories.Rehire.ELIGIBLE;
            case 1:
                return Categories.Rehire.NOTELIGIBLE;
            default:
                return Categories.Rehire.ELIGIBLE;
        }
    }

    protected Calendar randomHireDate() {
        Calendar hireDate = Calendar.getInstance();
        hireDate.set(rand.nextInt(10) + 2000, rand.nextInt(11),rand.nextInt(27));
        return hireDate;
    }
    protected Calendar randomBirthDate() {
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(rand.nextInt(40) + 1950, rand.nextInt(11),rand.nextInt(27)+1);
        return birthDate;
    }

}
