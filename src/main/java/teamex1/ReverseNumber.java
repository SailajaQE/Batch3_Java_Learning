package teamex1;

public class ReverseNumber {

    public static void main(String[] args) {
        int num = 78965 , reversed =0;

        System.out.println("Original Number is "+num);
        while (num !=0)
        {
            int temp = num % 10;  //to get the last digit
            reversed=reversed*10 + temp;
            num/=10;//gets the number eliminated the last digit
        }
        System.out.println("Reverse Number:  "+reversed);
    }
}
