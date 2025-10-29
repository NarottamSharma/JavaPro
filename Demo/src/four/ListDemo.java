package four;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class Car{
    String brand;
    Car(String brand){
        this.brand=brand;
    }
}

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
        IO.println(users.get(2));

//        List of objects
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Mercedes");
        Car car3 = new Car("Maruti");
        List<Car> carList = new ArrayList();
        carList.add(car1);
        carList.add(car3);
        carList.add(car2);
        for(Car car: carList){
            IO.println(car.brand);
        }

    }
}
