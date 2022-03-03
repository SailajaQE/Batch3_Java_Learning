package day8;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredifinedPredicate {
    public static void main(String[] args) {

        {
           Predicate<String> predicate = (a)->a.length() >4;
           System.out.println(predicate.test("Sailaja"));

            BiPredicate<String,Integer> biPredicate =(a,b) ->a.equals(b);
            System.out.println(biPredicate.test("Hello",6));

        }
    }
}
