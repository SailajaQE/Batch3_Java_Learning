package day3;

public class ReturningValues {

    public void notReturning()
    {
        System.out.println("Not returning any value from the method");
    }

    public int addition(int a, int b)
    {
        return a+b;
    }
    public double add(double val, double val1)
    {
        return val+ val1;
    }
    public String concat(String x, String y)
    {
        return x+y;
    }
    public boolean givingbackbool(boolean ch)
    {
        return ch;
    }
    public int remainerval (int no1, int no2)
    {
        return no1 % no2;
    }
    public int division (int num1, int num2)
    {
        return num1/num2;
    }
    public static void main(String[] args)
    {
        ReturningValues obj = new ReturningValues();
        obj.notReturning();
        int c = obj.addition(3,4);
        double result = obj.add(5.5,1.5);
        String name = obj.concat("first","second");
        boolean ch = obj.givingbackbool(true);
        int ans = obj.division(10,2);
        int rem = obj.remainerval(10,2);
        System.out.println("Returning int value" +c);
        System.out.println("String return value " + name);
        System.out.println("Returning Boolean Value  " + ch);
        System.out.println("Returing float value " + result);
        System.out.println("Division value " + ans);
        System.out.println("Remainder value " + rem);

    }
}