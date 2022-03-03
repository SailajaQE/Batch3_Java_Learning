package day3;

public class ReferenceUseMethod {
    public void method1()
    {
        System.out.println("No parameter method");
    }
    public void method1(int a)
    {
        this.method1();
        System.out.println("Passing one parameter method  " + a );
    }

    public static void main(String[] args) {
        ReferenceUseMethod obj = new ReferenceUseMethod();
        obj.method1(10);

    }
}
