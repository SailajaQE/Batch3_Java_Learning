package MyExcercies;

public class StringsH {
    public static void main(String[] args) {
        String str = "Welcome";
        String str1 = "Welcome";
        String str2 = new String("Welcome");
        String str3 = new String("Welcome").intern();
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
    }
}
