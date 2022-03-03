package day8;

import java.util.function.Predicate;

public class voterCheck {

    public String ageCheck(int num) {

        Predicate<Integer> age = i ->(i>18);
        System.out.println(age.test(num));
        if (age.test(num) == true) {
            System.out.println("Voter is Eligible for vote");
            return "Voter is Eligible for vote";
        } else {
            System.out.println("Voter is not Eligible for Vote");
            return "Voter is not Eligible for Vote";
        }
    }
}
