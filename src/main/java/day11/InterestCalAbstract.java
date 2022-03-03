package day11;

public class InterestCalAbstract {

    public static void main(String[] args)
    {
        BankAbstract obj1= new BOFAabstract();
        BankAbstract obj2 = new Chaseabstract();
        System.out.println("BOFA Interest Rate using Abstraction :  " +obj1.rateOfInterest());
        System.out.println("Chase Interest Rate using Abstraction :  "+obj2.rateOfInterest());

    }

}
