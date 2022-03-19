package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamConcepts
{
    public static void main(String[] args) {
        /*List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(29);*/

        List<Integer> list = Arrays.asList(1, 3, 5, 5, 5, 3, 3, 34, 56, 34, 78, 40, 28);
        List<String> str = Arrays.asList("Apple", "Orange", "Orange", "Olive", "kiwi", "mango", "grapes", "grapes");

        //Before performing Stream concepts

        System.out.println("Before the stream concepts" + list);

        // To distinct values
        System.out.println("After disctinct " + list.stream().distinct().collect(Collectors.toList()));

        // To sort ascending oder
        System.out.println("After Sorting" + list.stream().distinct().sorted().collect(Collectors.toList()));

        //Decending Order

        System.out.println("Decending Order" + list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        //displaying greater than 5

        System.out.println("Greater than" + list.stream().distinct().sorted().filter(a -> a > 5).collect(Collectors.toList()));

        //displaying the string which lengh is greater 5

        System.out.println("Length greater than 5" + str.stream().distinct().sorted().filter(a -> a.length() >= 5).collect(Collectors.toList()));
        // to filter the strings whose names start with O

        System.out.println("Filter with Starting name with O" + str.stream().distinct().sorted().filter(a -> a.startsWith("O")).collect(Collectors.toList()));
        // to add 3 to every element in the array.
        System.out.println("Adding 3 to every element in the list"+ list.stream().distinct().sorted().map(a->a+3).collect(Collectors.toList()));

        // to multiply 3 to every element in the array

        System.out.println("Multiplying the every element in the list"+list.stream().distinct().sorted().map(a->a*3).collect(Collectors.toList()));

    }
}

