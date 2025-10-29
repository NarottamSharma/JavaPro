package four;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    static void main(String[] args) {
        List<Integer> users = new ArrayList<>();
        users.add(100);
        users.add(500);
        users.add(10);
        users.add(20);
        IO.println(users);
        for(Integer user: users){
            IO.println(user);
        }
    }
}
