package Sprint3TeamE;

import com.sun.javafx.collections.MappingChange;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class Selection extends Logger implements BaseMethods {
    Statement stmt = DatabaseConnection.getDatabase();
    Employee employee=new Employee();
    //Map<Integer, ResultSet> map = new HashMap<>();

     @Override
        public void selectRecord () {
         System.out.println("Here are the Employee's List !");
         System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
         String query1 = "select * from team_e_sprint3.emp_data";
             try {
                 ResultSet rs = stmt.executeQuery(query1);
                 System.out.println("Emp_Id\t"+"First_Name\t\t"+"Last_Name\t\t"+"Date_Of_Birth\t"+"Gender\t"+"Marital_Status\t"+
                         "Date_Of_Joining\t\t"+"Designation\t\t\t"+"ReportingManager\t"+"ProjectName\t\t"+"Job_Status\t"
                         /*+"Base_salary\t"+"Emp_Benifits\t"+"Net_salary\t"+"Bonus\t"+
                         "Address\t"+"City\t"+"State\t"+"Email\t"+"Phone\t"*/);
                 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                 while (rs.next())
                     System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2) +"\t\t\t"+
                             rs.getString(3)+ "\t\t"+rs.getString(4)+"\t\t"+rs.getString(5)+
                             "\t\t"+rs.getString(6)+"\t\t\t"+rs.getString(7)+"\t\t\t"+
                             rs.getString(8)+"\t\t\t"+rs.getString(9)+"\t\t"+rs.getString(10)+
                             "\t"+rs.getString(11)+"\t\t\t"
                             /*+rs.getDouble(12)+"\t"+rs.getDouble(13)+"\t"+rs.getDouble(14)+"\t"+
                             rs.getDouble(15)+"\t"+rs.getString(16)+"\t"+rs.getString(17)+"\t"+
                             rs.getString(18)+"\t"+rs.getString(19)+"\t"+rs.getString(20)*/);
                 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                 System.out.println(" SELECT is Done: ");
             } catch (SQLException exception) {
                 String s1=String.valueOf(getClass());
                 String s2= String.valueOf(exception.getClass());
                 logger(s1,s2,exception.getMessage());
                 System.out.println(exception);
             }
     }
    @Override
    public void updateRecord(){}
    @Override
    public void insertRecord(){}
    @Override
    public void deleteRecord(){}
}

