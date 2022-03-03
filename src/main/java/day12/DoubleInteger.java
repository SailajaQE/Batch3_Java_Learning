package day12;

public class DoubleInteger {
    Double printer;

    DoubleInteger(Double printer)
    {
        this.printer = printer;
    }
    public void printDouble()
    {
        System.out.println(printer);
    }

    public static void main(String[] args) {
        DoubleInteger obj = new DoubleInteger(20.9);
        obj.printDouble();
    }
}
