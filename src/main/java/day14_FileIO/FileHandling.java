package day14_FileIO;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.*;


public class FileHandling {

    public void writetextfile()
    {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/FileRead_Write1.txt"));
            //BufferedWriter logfile = new BufferedWriter(new FileWriter("src/main/resources/ExceptionLog.txt"));

            bufferedWriter.write("Hello Java \n");
            bufferedWriter.write("Selenium \n");
            bufferedWriter.write("Rest assured");
            bufferedWriter.close();
            } catch (IOException e)
            {
                 System.out.println("Catching the exceptions in catch block");
                 e.getMessage();
                e.printStackTrace();
            }

    }
    public void writelogfile(String logmessage)
    {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/LogFile1.txt"));
            bufferedWriter.write(logmessage);
            bufferedWriter.close();
        } catch (IOException e)
        {
            System.out.println("Catching the exceptions in catch block");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public void readfile()
    {
        try {
            BufferedReader reader = new BufferedReader((new FileReader("src/main/resources/FileRead_Write.txt")));
            String line;
            //looping to read each line
            while((line=reader.readLine())!= null) {
               // System.out.println(line);
                //reader.close();
            }
            reader.close();

            } catch (IOException e)
            {
            System.out.println("My Catch Block");
                FileHandling obj1 = new FileHandling();
                obj1.writelogfile(e.getMessage());
                //obj1.writelogfile(e.printStackTrace());

            }
    }


    public static void main(String[] args) {
        //Writing to the existing file

        FileHandling obj = new FileHandling();
        obj.writetextfile();
        obj.readfile();
    }

}

