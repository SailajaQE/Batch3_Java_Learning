package day14_FileIO;
public class TestCaseExecution {
    public static void main(String[] args) {
        int MaxTestCase = 5;
        int a = 20;
        int b = 0;
        int c;
        for (int i = 1; i <= MaxTestCase; i++) {
            switch (i) {
                case 1:
                    System.out.println("TestCase Number :  " + i);
                    try {
                        c = a / b;
                    } catch (ArithmeticException e ) {
                        System.out.println("ArithmeticException ");
                        BaseMethods obj = new BaseMethods();
                        obj.writelogfile(e.getMessage(), i ); //Creating the new file to add the errors to Logerror.txt
                        //obj.closeFile();

                    }
                    break;
                case 2:
                    System.out.println("TestCase Number: " + i);
                    try {
                        String s = null; //null value
                        System.out.println(s.charAt(0));
                    } catch (NullPointerException e )
                    {
                        System.out.println("NullPointerException");
                        BaseMethods obj1 = new BaseMethods();
                        obj1.appendlogfile(e.getMessage(),i);  //adding errors to the existing file

                    }

                    break;

                case 3:
                    System.out.println("TestCase Number: " + i);
                    try {
                        String Str = "This is like testing!! "; // length is 22
                        char test = Str.charAt(24); // accessing 25th element
                        System.out.println(test);
                    }
                    catch(StringIndexOutOfBoundsException e) {
                        System.out.println("StringIndexOutOfBoundsException");
                        BaseMethods obj3 = new BaseMethods();
                        obj3.appendlogfile(e.getMessage(), i);
                    }
                    break;
                case 4:
                    System.out.println("TestCase Number:" + i);
                    try{
                        int x[] = new int[5]; //size 5
                        x[20] = 9; // accessing 20th element in an array of

                    }
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println ("Array Index is Out Of Bounds  "+ e.getMessage());
                        BaseMethods obj4 = new BaseMethods();
                        obj4.appendlogfile(e.getMessage(),i);
                    }
                    break;
                 case 5:
                    System.out.println("TestCase Number: " + i);
                    try
                    {
                        int s1 =10, s2=10,s3=0;
                        s3 = s1 + s2;
                        System.out.println("Execution is Successful");
                        BaseMethods obj6 = new BaseMethods();
                        obj6.suceessMessage(i);
                    }
                    catch(Exception e) {
                        BaseMethods obj5 = new BaseMethods();
                        obj5.appendlogfile(e.getMessage(), i);
                    }
                    break;
                default:
                    System.out.println("Testcase Execution is completed");
                    break;
            }
            }


        }

    }










