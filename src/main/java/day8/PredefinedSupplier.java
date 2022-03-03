package day8;

import java.util.function.Supplier;

public class PredefinedSupplier {
    public static void main(String[] args) {
        Supplier<String> supplier = ()->"java";
        Supplier<Integer> obj = ()->6;
        System.out.println(supplier.get());
        System.out.println(obj.get());
    }
}
