package day15;

import java.util.Scanner;

public class abc {

           public static void main(String[] args){
               abc a = new abc();
            a.inputEmail();
        }

        public boolean checkEmailvalidity(String emailaddress){
            String email_regex = "[A-Z]+[a-zA-Z_]+@\b([a-zA-Z]+.){2}\b?.[a-zA-Z]+";
            boolean b = emailaddress.matches(email_regex);
            return b;
        }

        public void inputEmail(){
            System.out.println("Please enter your email address ex:xyz@gmail.com");
            Scanner sc = new Scanner(System.in);
            String emailaddress=sc.nextLine();
            boolean a = checkEmailvalidity(emailaddress);
            if(a){
                System.out.println("Valid email");
            } else {
                System.out.println("InValid email");
                inputEmail();
            }
        }
}
