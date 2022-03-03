package day14_FileIO;

import java.io.*;

public class BaseMethods {

    public void readfile() {
        try {
            BufferedReader reader = new BufferedReader((new FileReader("src/main/resources/LogFile1.txt")));
            String line;

            //looping to read each line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("My Catch Block");

        }
    }

//Writing File

    public void writetextfile() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/FileRead_Write1.txt"));
            //bufferedWriter.write("Hello Java \n");
            //bufferedWriter.write("Selenium \n");
            //bufferedWriter.write("Rest assured");
            bufferedWriter.close();
        } catch (IOException e) {
            //System.out.println("Catching the exceptions in catch block");
            e.getMessage();
            e.printStackTrace();
        }
    }

    public void closeFile() {

        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/LogFile1.txt"));
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    //Writing Log file

    public void writelogfile(String logmessage, int TestId) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/Logerror.txt", false));
            bufferedWriter.write("Test Case  " + TestId + " is failed : ");

            bufferedWriter.write(logmessage);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {

            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

   /* public void appendlogfile(String logmessage, int TestId) {
        try {

            BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("src/main/resources/Logerror.txt", true));
            bufferedWriter1.write("Test Case  " + TestId + " is failed : ");
            //bufferedWriter1.write(logmessage);

            //PrintWriter pw = new PrintWriter(bufferedWriter1);
            //pw.println(logmessage);
            bufferedWriter1.close();
            //pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public void suceessMessage(int TestId) {

        try {
            BufferedWriter buff = new BufferedWriter(new FileWriter("src/main/resources/Logerror.txt", true));
            buff.write("Test case  " + TestId + "  is Passed");
            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void appendlogfile(String logmessage, int TestId) {
        try {

            BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("src/main/resources/Logerror.txt",true));
            bufferedWriter1.write("Test Case  " + TestId + " is failed : ");
            //bufferedWriter1.write(logmessage);

            PrintWriter pw = new PrintWriter(bufferedWriter1);
            pw.println(logmessage);
            bufferedWriter1.close();
            pw.close();
        } catch (IOException e) {
              e.printStackTrace();
        }
    }
 }

