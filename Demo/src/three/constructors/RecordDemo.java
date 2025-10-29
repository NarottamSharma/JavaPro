package three.constructors;
record Bike(String brand, int speed){}

public class RecordDemo {
    static void main(String[] args) {
        Bike bike = new Bike("BMW", 300);
        IO.println("Brand "+ bike.brand());
        IO.println(bike.speed());


    }
}
