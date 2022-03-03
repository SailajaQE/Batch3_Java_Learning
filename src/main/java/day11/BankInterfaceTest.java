package day11;

public class BankInterfaceTest {
    public static void main(String[] args) {
        BankInterface obj1= new BOFAInterface();
        System.out.println("BOFA Interest Rate using Interface:  " +obj1.rateOfInterest());
        BankInterface obj2 = new ChaseInterface();
        System.out.println("Chase Interest Rate using Interface:   "+ obj2.rateOfInterest());
    }
}
