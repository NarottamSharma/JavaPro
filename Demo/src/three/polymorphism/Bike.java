package three.polymorphism;

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
    @Override
    public void start(){
        IO.println("Bike Started");
    }
    public void start(String greet){
        IO.println("Bike Started "+greet);
    }
}
