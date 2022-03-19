package day17_Interview_Questions;
import java.util.ArrayList;
import java.util.Stack;
import java.util.stream.Collectors;

public class InterviewQuestions {


public static void main(String[] args) {

            String name = "Kalyan";

            //Convert the String name into Character arr
            char[] chaArr = name.toCharArray();

            //Creating a List
            ArrayList<String> arrayList = new ArrayList<>();

            for(int i=0; i<chaArr.length; i++)
            {
                arrayList.add(String.valueOf(chaArr[i]));
            }

            System.out.println(arrayList);

            //Creating Stack
            Stack<String> stack = new Stack<>();

     while(arrayList.size() > 0)
    {
        stack.push(arrayList.remove(0));
    }


    while(stack.size() > 0)
            {
                arrayList.add(stack.pop());
            }

            System.out.println(arrayList);

            String reversedName = arrayList.stream().collect(Collectors.joining());


            System.out.println("Given String is: "+name);
            System.out.println("Reversed String is: "+reversedName);




        }
    }

