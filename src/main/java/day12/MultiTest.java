package day12;

public class MultiTest {
    public static void main(String[] args) {
       for (int i=1;i<=3;i++) {
           MultiThreading obj1 = new MultiThreading(i);
           obj1.start();
       }
    }
}
