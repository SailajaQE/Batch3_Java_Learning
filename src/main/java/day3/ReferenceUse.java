package day3;

public class ReferenceUse {
    //create a zero constructor

    ReferenceUse()
    {
        System.out.println("it is zero constructor");
    }
    //one parameter constructor

    ReferenceUse(int a )
    {
        this();
        System.out.println("Passing one parameter in constructor  " + a);
    }
    // two parameter constructor
    ReferenceUse(int a, int b)
    {
        this(a);
        System.out.println("Passing Two parameters  " + a +"  " +  b);
    }

    // two parameter different data type
    ReferenceUse(int  name, String name1)
    {
        this (name);
        System.out.println("Passing String two parameters " + name +" " + name1);
    }
    // three parameter constructor
    ReferenceUse(int x, int y, int z)
    {
        this(x,y);
        System.out.println("Passing Three parameters  "  + x + "  "+ y + " " + z );
    }
    public static void main(String[] args)
    {
        ReferenceUse obj = new ReferenceUse(10,20, 30);
        ReferenceUse obj1 = new ReferenceUse(10,"Sailaja");


    }
}
