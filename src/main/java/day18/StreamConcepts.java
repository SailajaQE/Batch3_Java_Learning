package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamConcepts {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7);
        List<String> list2 = Arrays.asList("Apple","Banana","Orange","Peach","Beets","Pat");
        // to find the sum of all numbers
        System.out.println(list.stream().distinct().reduce(0,(a,b)->a+b));
        // to find multiplication of all numbers
        System.out.println(list.stream().distinct().reduce(1,(a,b)->a*b));

        // to use method reference for summation

        System.out.println(list.stream().distinct().reduce(0,Integer::sum));
        // to find maximum value
        System.out.println(list.stream().distinct().reduce(0,Integer::max));
        // To find minimum value
        System.out.println(list.stream().distinct().reduce(1,Integer::min));
        // To list first 2 numbers
        System.out.println(list.stream().limit(2).collect(Collectors.toList()));
        // to skip the frist 2 numbers
        System.out.println(list.stream().distinct().skip(2).collect(Collectors.toList()));

        // Any , none, all
        System.out.println(list2.stream().distinct().anyMatch(a->a.startsWith("A")));

        System.out.println(list2.stream().distinct().allMatch(a->a.length() >2));

        //none matcg
        System.out.println(list2.stream().distinct().noneMatch(a->a.startsWith("z")));

        //count

        System.out.println(list2.stream().distinct().findFirst().get());

        System.out.println(list2.stream().distinct().filter(a->a.startsWith("B")).count());






    }
}
