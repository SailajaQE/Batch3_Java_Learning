package day16;

import java.util.HashMap;
import java.util.Map;

public class StudentMAPCollection {
    public static void main(String[] args) {
        BaseMethods baseMethods = new BaseMethods();
        HashMap<String, Student> map = new HashMap<String, Student>();
        map = init();
        // iterate to all the keys stored on our hashmap
        for (String s : map.keySet()) {
            // print the student id and age
            System.out.println("Student with id number:" + s + " is "
                    + map.get(s).stuAge + " years old");
        }
    }

    private static HashMap<String, Student> init() {
        // initialize our student objects

        Student s1 = new Student(131, "Sam12", "GroupX", 27);
        Student s2 = new Student(132, "Ram12", "GroupX", 37);
        Student s3 = new Student(133, "Sara12", "GroupX", 47);
        Student s4 = new Student(134, "Raj12", "GroupX", 57);

        // initialize of hashmap
        HashMap<String, Student> map = new HashMap<String, Student>();

        // assign each student id as key and the student objects as values on
        // our hashmap
        map.put("131",s1);
        map.put("132",s2);
        map.put("133",s3);
        map.put("134",s4);


        return map;


    }}

