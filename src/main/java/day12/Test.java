package day12;

public class Test {
    public static void main(String[] args) {
        GenericClass<Integer> obj1 = new GenericClass<>(10);
        obj1.printValue();
        GenericClass<String> obj2 = new GenericClass<>("java");
        obj2.printValue();
        GenericClass<Double> obj3 = new GenericClass<>(34.5);
        obj3.printValue();
    }
}
