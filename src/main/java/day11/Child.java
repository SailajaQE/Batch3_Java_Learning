package day11;

public class Child extends Parent {
    public void behaviour()
    {
        System.out.println("Child Behaviour");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.behaviour();
    }
}
