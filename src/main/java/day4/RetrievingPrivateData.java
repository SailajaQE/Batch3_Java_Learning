package day4;

public class RetrievingPrivateData {

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        System.out.println("Before Setters");
        System.out.println(obj.getAge());
        System.out.println(obj.getStudentName());

        obj.setAge(44);
        obj.setStudentName("java");
        System.out.println("After Setters");
        System.out.println(obj.getAge());
        System.out.println(obj.getStudentName());
    }
}
