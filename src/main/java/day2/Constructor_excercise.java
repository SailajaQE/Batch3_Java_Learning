package day2;

public class Constructor_excercise {
    //zero construcror
    Constructor_excercise()
    {
        System.out.println("Zero constructor");
    }
    Constructor_excercise(int a)
    {
        System.out.println("Passing single parameter to the constructor");
        System.out.println(a);
    }
    Constructor_excercise(int x, int y)
    {
        System.out.println("Passing two parameters to the constructor");
        System.out.println(x);
        System.out.println(y);
    }
   Constructor_excercise(String s)
    {
        System.out.println("Passing String parameter to the constructor");
        System.out.println(s);
    }

    public static void main(String[] args) {
        Constructor_excercise obj = new Constructor_excercise();
        Constructor_excercise obj1= new Constructor_excercise(10);
        Constructor_excercise obj2 = new Constructor_excercise(20,30);
        Constructor_excercise obj3 = new Constructor_excercise(("hello"));
    }
}


