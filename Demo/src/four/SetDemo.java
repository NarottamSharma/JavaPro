package four;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    static void main(String[] args) {
        Set<String> roles = new HashSet<>();
        roles.add("admin");
        roles.add("user");
        roles.add("user");

        for(String role:roles){
            IO.println(role);
        }
        roles.remove("admin");
        for(String role:roles){
            IO.println(role);
        }

    }
}
