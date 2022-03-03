package day1;

public class Local_Instance_static {
    //intialize instance variables

    int a ;
    boolean ch;
    int b;

    static int i = 10;

    public static void main(String[] args) {
        Local_Instance_static obj = new Local_Instance_static();
        System.out.println("Displaying instance variables default values");
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.ch);

        System.out.println("static variable" + i);
        obj.method1(10,20);

    }
    public void method1 (int x, int y)
    {
        int sum = x+y;
        System.out.println("local varilables sum" + sum);
    }
}
