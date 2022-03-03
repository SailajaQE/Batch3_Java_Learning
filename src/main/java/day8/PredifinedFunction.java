package day8;

import java.util.function.Function;

public class PredifinedFunction
{
    public static void main(String[] args) {
        Function<String,String> function = (a)->a.toUpperCase();
        String val = function.apply("hello");
        System.out.println(val);

        Function<Integer,Integer> f = n->n+n;
        System.out.println(f.apply(25));

        Function<String,Integer> fn = s ->s.length();
        System.out.println(fn.apply("Sailaja"));

    }
}
