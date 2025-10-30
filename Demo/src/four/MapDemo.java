package four;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    static void main(String[] args) {
        Map<Integer,String> userMap = new HashMap<>();
        userMap.put(1,"Narottam");
        userMap.put(2,"Gaurav");
        userMap.put(3,"Akhil");
        IO.println(userMap);
        IO.println(userMap.get(2));
        for(Map.Entry<Integer,String> entry:userMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
