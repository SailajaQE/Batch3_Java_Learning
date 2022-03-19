package day16;
//@lombok
public class Student {
    int stuId;
    String stuName;
    String stuGrade;
    int stuAge;

    public Student (int stuId,String stuName, String stuGrade, int stuAge) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuGrade = stuGrade;
        this.stuAge = stuAge;
    }
    public int getStudentid() {
        return stuId;
    }
}
