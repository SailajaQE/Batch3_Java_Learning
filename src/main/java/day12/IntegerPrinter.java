package day12;

public class IntegerPrinter {
    Integer printer;

    IntegerPrinter(Integer printer)
    {
        this.printer = printer;
    }
    public void printInteger()
    {
        System.out.println(printer);
    }

    public static void main(String[] args) {
        IntegerPrinter obj = new IntegerPrinter(19);
        obj.printInteger();
    }
}
