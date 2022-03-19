package day16;

import java.util.ArrayList;

public class StudentCollection {
    public static void main(String[] args) {
        BaseMethods baseMethods = new BaseMethods();
        ArrayList<Student> arrayList = new ArrayList<>();
        Student student1 = new Student(114, "Sam1", "GroupA", 17);
        Student student2 = new Student(115, "Ram1", "GroupA", 17);
        Student student3 = new Student(116, "Sara1", "GroupA", 17);
        Student student4 = new Student(117, "Raj1", "GroupA", 17);
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);

        for (Student stu: arrayList)
        {
           /* System.out.println("Student Id"+stu.stuId);
            System.out.println("Student Name"+ stu.stuName);
            System.out.println("Student Group"+stu.group);
            System.out.println("Student Grade"+stu.grade);*/
            //baseMethods.insertRecord(stu.stuId,stu.stuName,stu.stuGrade,stu.stuAge);
            baseMethods.updateRecord(stu.stuId,stu.stuName,stu.stuGrade,stu.stuAge);
            //baseMethods.selectRecord(stu.stuId,stu.stuName,stu.stuGrade,stu.stuAge);



        }



    }
}
