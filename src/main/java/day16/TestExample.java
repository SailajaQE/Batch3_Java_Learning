package day16;

import com.github.javafaker.Faker;

import java.util.Date;

public class TestExample {
    public static void main(String[] args) {
        Faker f = new Faker();
        String s = String.valueOf(new Date(f.date().birthday().getTime()));
        long s2 = f.date().birthday().getTime();
        System.out.println(s);
        System.out.println(s2);
    }
}
