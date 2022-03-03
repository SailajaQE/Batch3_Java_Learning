package day10;

public class ChildClass extends ParentClass {
    int b=10;
    ChildClass()
    {
        //super();
        System.out.println("This is child class");
    }
    public void methodChild()
    {
        super.ParentMethod();
        System.out.println("Child Method"+b);
        System.out.println("Parent Variable: " + super.a);
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        //obj.ParentMethod();
        obj.methodChild();
    }
}
