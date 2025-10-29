package three.inheritance;

public class Bike extends Vehicle {
    int gear;
    public Bike(String brand, int speed, int gear){
        super(brand,speed);
        this.gear = gear;
    }
    @Override
    public void displayInfo(){
        IO.println("Bike brand is "+getBrand()+" and its speed is "+getSpeed()+" and has running on gear "+gear);
    }
}
