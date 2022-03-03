package day12;

public class GenericClass<T> {
    T printer;
    GenericClass(T printer)
    {
        this.printer = printer;
    }
    public void printValue()
    {
        System.out.println(printer);
    }
}
