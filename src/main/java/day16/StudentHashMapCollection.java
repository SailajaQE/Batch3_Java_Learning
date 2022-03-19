package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentHashMapCollection {
    public static void main(String[] args) {
        BaseMethods baseMethods = new BaseMethods();
        Map<Integer, Student> map = new HashMap<Integer, Student>();

        Student s1 = new Student(161, "Sailaja", "GroupB", 67);
        Student s2 = new Student(162, "Sanjana", "GroupB", 77);
        Student s3 = new Student(163, "Samanvi", "GroupB", 87);
        Student s4 = new Student(164, "Srinika", "GroupB", 97);


        map.put(161, s1);
        map.put(162, s2);
        map.put(163, s3);
        map.put(164, s4);

        for (Map.Entry m : map.entrySet()) {
            Student s = (Student) m.getValue();
            System.out.println(m.getKey() + "  :  " + s.stuName + " " + s.stuGrade + " " + s.stuAge);
            //baseMethods.updateRecord(s.stuId,s.stuName,s.stuGrade,s.stuAge);
            //baseMethods.insertRecord(s.stuId,s.stuName,s.stuGrade,s.stuAge);
            //baseMethods.selectRecord(s.stuId,s.stuName,s.stuGrade,s.stuAge);
            baseMethods.deleteRecord(s.stuId,s.stuName,s.stuGrade,s.stuAge);
        }


        }
    }









