
package Sprint3;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import day18.USAEnum;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

    public class EmployeeLeaves extends Logger{
        Statement statement = DatabaseConnection.getDatabase();
        int paternity_leave;
        int maternity_leave;

        public void applyLeave() throws FilloException {
            try
            {
                Fillo fillo = new Fillo();
                Connection connection = fillo.getConnection("src/main/resources/Sprint3_Leaves.xlsx");
                System.out.println("Do you want to apply for leave Y /N ");
                Scanner scanner=new Scanner(System.in);
                String str=scanner.nextLine();
                if(str.equalsIgnoreCase("y"))
                {
                    System.out.println("enter your emp_id");
                    int emp_id=Integer.parseInt(scanner.nextLine());
                    //String first_name=scanner.nextLine();
                    System.out.println(" which leave you Want ? ");
                    Leaves_Menu.menu();
                    int leaveChoice=Integer.parseInt(scanner.nextLine());
                    String Query = null;
                    int count=0;
                    int leave =0;
                    String query1;
                    Recordset rs;
                    switch (leaveChoice) {
                        case 1:
                            System.out.println("How many leaves do you want?");
                            count = Integer.parseInt(scanner.nextLine());
                            query1= "select paternity_leaves from Sheet1 where emp_id =" + emp_id;
                            rs = connection.executeQuery(query1);
                            while(rs.next())
                            {
                                 leave = Integer.parseInt(rs.getField("paternity_leaves"));

                            }
                            if (leave < 7) {
                                count = leave + count;
                                if (count <=7) {
                                    Query = "Update Sheet1 Set paternity_leaves =" + count + "where emp_id=" + emp_id;
                                    connection.executeUpdate(Query);
                                    System.out.println(" LEAVE is Confirmed: ");
                                }else System.out.println("You have limited leaves Check it");
                            }else System.out.println("Reached Max count of Paternity leaves");
                            break;
                        case 2:
                            System.out.println("How many leaves do you want?");
                            count = Integer.parseInt(scanner.nextLine());
                            query1= "select maternity_leaves from Sheet1 where emp_id =" + emp_id;
                             rs = connection.executeQuery(query1);
                            while(rs.next())
                            {
                                leave = Integer.parseInt(rs.getField("maternity_leaves"));

                            }
                            if (leave < 42) {
                                count = leave + count;
                                if (count <=42) {
                                     Query = "Update Sheet1 Set maternity_leaves =" + count + "where emp_id=" + emp_id;
                                     connection.executeUpdate(Query);
                                     System.out.println(" LEAVE is Confirmed: ");
                                }else System.out.println("You have limited leaves Check it");
                            }else System.out.println("Reached Max count of Maternity leaves");
                            break;
                        case 3:
                            System.out.println("How many leaves do you want?");
                            count = Integer.parseInt(scanner.nextLine());
                            query1= "select personal_leaves from Sheet1 where emp_id =" + emp_id;
                            rs = connection.executeQuery(query1);
                            while(rs.next())
                            {
                                leave = Integer.parseInt(rs.getField("personal_leaves"));
                            }
                            if (leave < 6) {
                                count = leave + count;
                                if (count <=6) {
                                  Query = "Update Sheet1 Set personal_leaves =" + count + "where emp_id=" + emp_id;
                                  connection.executeUpdate(Query);
                                    System.out.println(" LEAVE is Confirmed: ");
                                }else System.out.println("You have limited leaves Check it");
                            }else System.out.println("Reached Max count of Personal leaves");
                            break;
                        case 4:
                            System.out.println("How many leaves do you want?");
                            count = Integer.parseInt(scanner.nextLine());
                            query1= "select sick_leaves from Sheet1 where emp_id =" + emp_id;
                            rs = connection.executeQuery(query1);
                            while(rs.next())
                            {
                                leave = Integer.parseInt(rs.getField("sick_leaves"));

                            }
                            if (leave < 6) {
                                count = leave + count;
                                if (count <=6) {
                                       Query = "Update Sheet1 Set sick_leaves =" + count + "where emp_id=" + emp_id;
                                       connection.executeUpdate(Query);
                                       System.out.println(" LEAVE is Confirmed: ");
                                }else System.out.println("You have limited leaves Check it");
                            }else System.out.println("Reached Max count of sick leaves");
                            break;



                        case 5:
                            System.out.println("How many leaves do you want?");
                            count = Integer.parseInt(scanner.nextLine());
                            query1= "select floating_holidays from Sheet1 where emp_id =" + emp_id;
                            rs = connection.executeQuery(query1);
                            while(rs.next())
                            {
                                leave = Integer.parseInt(rs.getField("floating_holidays"));

                            }
                            if (leave < 2) {
                                count = leave + count;
                                if (count <=2) {
                                   Query = "Update Sheet1 Set floating_holidays =" + count + "where emp_id=" + emp_id;
                                   connection.executeUpdate(Query);
                                   System.out.println(" LEAVE is Confirmed: ");
                                }else System.out.println("You have limited leaves Check it");
                            }else System.out.println("Reached Max count of floating leaves");
                            break;
                        case 6:
                            System.out.println("Which USA Holiday?");
                            String str1 = scanner.nextLine();
                            for(Holidays h:Holidays.values()) {

                                if (h.toString().equalsIgnoreCase(str1)) {
                                    count++;

                                }
                                query1 = "select us_holidays from Sheet1 where emp_id =" + emp_id;
                                rs = connection.executeQuery(query1);
                                while (rs.next()) {
                                    leave = Integer.parseInt(rs.getField("us_holidays"));
                                }
                            }
                            if (leave < 9) {
                                count = leave + count;
                                if (count <=9) {

                                Query = "Update Sheet1 Set us_holidays="+count+ " where emp_id=" + emp_id;
                                connection.executeUpdate(Query);
                                System.out.println(" LEAVE is Confirmed: ");
                                }else System.out.println("You have limited holidays Check it");
                            }else System.out.println("Reached Max count of US holidays");

                                break;

                        default:
                            System.out.println("Enter the correct option");
                    }





                   /* String Query = null;
                    for(Leaves l:Leaves.values()){
                        if(l.equals(str)){
                            Query="Update Sheet1 Set paternity_leaves = paternity_leave "+str+"=1 where emp_id="+emp_id+","+"first_name="+"'"+first_name+"'";
                        }
                    }*/

                    //}


               // }else{
                 //   System.out.println(" Please choose appropriate option");
                }
            } catch(Exception exception) {
                String s1 = String.valueOf(getClass());
                String s2 = String.valueOf(exception.getClass());
                logger(s1, s2, exception);
                //System.out.println(exception);
            }
        }
    }

