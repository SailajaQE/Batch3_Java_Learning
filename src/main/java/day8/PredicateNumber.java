package day8;

import java.util.function.Predicate;

public class PredicateNumber {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,10,25,78,90};
        Predicate<Integer> pr1 = e->e%2==0;
        Predicate<Integer> pr2 = e->e<10;

        for(int n:num)
        {
            //if(pr1.test(n) && (pr2.test(n)))
            if(pr1.and(pr2).test(n))
            {
                System.out.println(n);
            }
        }
        for(int n:num)
        {
            //if(pr1.test(n) && (pr2.test(n)))
            if(pr1.or(pr2).test(n))
            {
                System.out.println(n);
            }
        }
        for (int n:num)
        {
            if(pr1.negate().test(n)) {
                System.out.println(n);
            }
        }

    }
}
