package day10;

public class StaticNonStaticBlocks {
  int a =3;
  static int b = 78;
    StaticNonStaticBlocks()
    {
        System.out.println("I am Constructor");
    }

    static
    {
        System.out.println("I am a Static Block");
        b=1000;
    }
    {
        System.out.println("I am non Static Block1");
        a=20;
    }
    {
        System.out.println("I am non Static Block 2 overwriting the value");
        a=55;
    }

    public static void main(String[] args) {
        StaticNonStaticBlocks obj = new StaticNonStaticBlocks();
        //StaticNonStaticBlocks obj2 = new StaticNonStaticBlocks();
        System.out.println(obj.a);
        System.out.println(b);
    }
}
