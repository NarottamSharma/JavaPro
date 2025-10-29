package three.inheritance;

import java.awt.image.ImagingOpException;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }
    public void info(){
        IO.println("Brand is "+getBrand()+" and speed is "+getSpeed()+" and it has "+doors+" doors");
    }
}
