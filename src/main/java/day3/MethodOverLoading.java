package day3;

public class MethodOverLoading {
    public void method1() {
        System.out.println("Passing the method without parameters");
    }

    public void method1(double a) {
        System.out.println("Passing the method with one parameter      " + a);
    }

    public void method2(int a, String s) {
        System.out.println("Passing two parameters " + a + "   string as " +    s);
    }

    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        obj.method1();
        obj.method1(10);
        obj.method2(20, "hello");
    }
}
