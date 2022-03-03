package day8;

import java.util.function.Predicate;

public class PredicateStringCheck {
    public static void main(String[] args) {
        Predicate<String> name = s->(s.length()>4);


    }
}
