package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapConcepts {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(100,"Sam");
        map.put(200,"Tom");
        map.put(300,"Sara");

        map.remove(100);

        for (Map.Entry m: map.entrySet())
        {
            System.out.println(m.getKey()+ "   " +m.getValue());
        }
        //get the 200 key --value
        System.out.println(map.get(200));

    List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        for(Integer a:list)
        {
            System.out.println(a);

        }

    }
}
