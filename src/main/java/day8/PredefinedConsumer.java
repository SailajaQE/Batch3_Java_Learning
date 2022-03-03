package day8;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class PredefinedConsumer {
    public static void main(String[] args) {
        Consumer<String> cs = (a)-> System.out.println(a);
        cs.accept("Predefined Interface");
    }
    BiConsumer<String,String> biConsumer = (a,b) -> System.out.println(a+b);
    //biConsumer.accept("Sailaja","Arudala");

}
