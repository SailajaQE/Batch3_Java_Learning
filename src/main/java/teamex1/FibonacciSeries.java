package teamex1;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int n=20;
        int c;
        System.out.println(a);
        System.out.println(b);
        while(n>0)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            n--;
        }


    }

}
