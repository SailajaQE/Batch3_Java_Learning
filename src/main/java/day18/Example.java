package day18;

@FunctionalInterface
interface inter
{
    //public Integer difference(int a, int b);
    public Integer mul (int a, int b);
}

public class Example {
    public static void main(String[] args) {
       // inter obj = (a,b) -> a - b;
        //int result = obj.difference(18,9);
        inter obj2 = (a,b) -> a*b;
        int mulresult = obj2.mul(7,8);
       // System.out.println(result);
        System.out.println(mulresult);

    }


}
