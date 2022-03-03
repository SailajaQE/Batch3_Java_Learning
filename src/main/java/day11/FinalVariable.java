package day11;

public class FinalVariable {
    int a =10;
    //final int a=10;
    public int setVal()
    {
        a =20;
        return a;
    }

    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        System.out.println(obj.setVal());
    }
}
