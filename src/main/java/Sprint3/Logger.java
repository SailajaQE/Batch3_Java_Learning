package Sprint3;


import java.io.BufferedWriter;
import java.io.FileWriter;

public class Logger {

    public  void logger(String s1,String s2,Exception e){
        try{
            //BufferedReader bufferedReader= new BufferedReader(new FileReader("src/main/resources/Sprint3Logger.txt"));
            BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter("src/main/resources/Sprint3Logger.txt",true));
            bufferedWriter.write(s1+"\n"+s2+"\n"+e+"\n\n" );
            bufferedWriter.close();
        }catch(Exception ex) {
            ex.getMessage();
        }
    }
}