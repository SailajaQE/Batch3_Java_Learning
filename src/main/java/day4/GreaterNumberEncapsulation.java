package day4;

public class GreaterNumberEncapsulation {
    public static void main(String[] args) {
        int greaterNumber;
        EncapsulationLargestNo obj = new EncapsulationLargestNo();
        obj.setNumber1(100);
        obj.setNumber2(20);
        obj.setNumber3(10);

        greaterNumber = obj.methodgreater();
        System.out.println("Greatest Number is  " + greaterNumber);
    }

}
