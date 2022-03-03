package day12;

import java.util.Locale;

public class StringOperatorClass {
    public static void main(String[] args) {
        String val = "This is Batch3 java sessions  ";
        String val2 = "automation";
        // To find out length
        System.out.println(val.length());

        //to remove the spaces from beginning and ending
        System.out.println(val.trim());

        //to uppercase
        System.out.println(val.toUpperCase(Locale.ROOT));
        //to lower case
        System.out.println(val.toLowerCase(Locale.ROOT));

        // to check string contains
        System.out.println(val.contains("java"));

        //to get substring
        System.out.println(val.substring(0,14));

        //to replace
        System.out.println(val.replace("java","c#"));
        // to check position
        System.out.println(val.lastIndexOf("j"));
        // to check empty
        System.out.println(val.isEmpty());

        // concatinate
        System.out.println(val.concat(val2));
    }
}
