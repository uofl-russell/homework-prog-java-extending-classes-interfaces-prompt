import TestPackage.*;

public class Main {
    public static void main(String[] args) {
        int argument;
        try {
            argument = Integer.parseInt(args[0]);
        } catch (Exception e) {
            argument = 150;
        }
        FETest FE = new FETest(argument);
        FE.test();
        BETest BE = new BETest(argument);
        BE.test();
        AWSTest AWS = new AWSTest(argument);
        AWS.test();
        AzureTest Azure = new AzureTest(argument);
        Azure.test();
        ResearchTest Research = new ResearchTest(argument);
        Research.test();
        CSuiteTest CEO = new CSuiteTest(argument);
        CEO.test();
    }
}