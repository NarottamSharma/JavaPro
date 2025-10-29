package three.classesdemo;

import java.io.File;
import java.util.Date;

public class ClassObjectDemo {
    static void main(String[] args) {
        Car car1 = new Car(); // car class object created
        car1.speed=100;
        car1.brand = "Mercedies";
        car1.color = "white";
        car1.drive();

        Date date = new Date();
        IO.println(date.getTime());

        File file;
        Integer i;

    }
}
