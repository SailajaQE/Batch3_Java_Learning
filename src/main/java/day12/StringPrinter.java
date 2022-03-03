package day12;

public class StringPrinter {
    String printer;

    StringPrinter(String printer)
    {
        this.printer = printer;
    }
    public void printString()
    {
        System.out.println(printer);
    }

    public static void main(String[] args) {
        StringPrinter obj = new StringPrinter("hello");
        obj.printString();
    }
}
