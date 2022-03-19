package Sprint3;

import day16.Student;

import java.util.HashMap;
import java.util.Map;
//import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.sql.Date;



public class EmpInput {

    public static void main(String[] args) {
        Employee emp = new Employee();


        Map<Integer, Employee> map = new HashMap<Integer, Employee>();

       // Date d= Date.valueOf("1970-2-2");
        //Date d1 = Date.valueOf("1990-12-12");
       /* Employee e1 = new Employee(1001, "Mahesh", "Ghattamaneni", Date.valueOf("1970-2-2"), "M", "Married", Date.valueOf("1990-12-12"), "Senior Manager", "Krishna", "Movie Production", "FullTime", 20000, 1000, 25000, 10000, "3631 Glover Point, Ulyssesborough, NM 40401-6469",
                "Schmittville", "Arkansas", "vasiliki.schmeler@yahoo.com", "1-182-251-0857");
        Employee e2 = new Employee(1002, "Tarak", "Nandamuri", Date.valueOf("1983-5-20"), "M", "Married", Date.valueOf("1999-12-12"), "Manager", "BalaKrishna", "NTR Arts", "Contract", 20000, 1000, 25000, 10000, "Road No :2 , Banjara Hills",
                "Hyderabad", "Telangana", "TarakN@yahoo.com", "1-197-111-1957");
        Employee e3 = new Employee(1003, "PavanKalyan", "Konidela", Date.valueOf("1973-5-20"), "M", "Married", Date.valueOf("1995-12-12"), "Manager", "Chiranjeevi", "Konidela", "Contract", 20000, 1000, 25000, 10000, "Road No :3 , Banjara Hills",
                "Hyderabad", "Telangana", "PavanK@yahoo.com", "1-199-111-1999");
        Employee e4 = new Employee(1004, "Vijay", "DevaraKonda", Date.valueOf("1990-5-20"), "M", "Married", Date.valueOf("2010-12-12"), "Manager", "Puri Jagannath", "Liger", "Full Time", 25000, 1000, 30000, 10000, "Road No :4 , Banjara Hills",
                "Hyderabad", "Telangana", "VijayK@yahoo.com", "1-199-888-1999");


        map.put(1001, e1);
        map.put(1002,e2);
        map.put(1003,e3);
        map.put(1004,e4);


        for (Map.Entry m : map.entrySet()) {
            Employee e = (Employee) m.getValue();
            System.out.println(m.getKey() + "  :  " + e.first_name + " " +e.last_name + " "+ e.dob + " " + e.base_salary);
            //map.put(162, s2);
            //map.put(163, s3);
            //map.put(164, s4);*/
        }
    }

