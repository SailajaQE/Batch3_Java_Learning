package day11;

public class interestCalculate {
    public static void main(String[] args) {
        BOFA obj1 = new BOFA();
        Chase obj2 = new Chase();
        System.out.println("BOFA Interest rate using class: "+obj1.rateOfInterest());
        System.out.println("Chase Interest rate using class:  "+obj2.rateOfInterest());
    }
}
