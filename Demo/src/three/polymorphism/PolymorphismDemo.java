package three.polymorphism;

public class PolymorphismDemo {
    static void main(String[] args) {
        Car c1 = new Car("Toyota",25,5);
        c1.displayInfo();
        c1.info();
        c1.start();

        Bike b = new Bike("Honda",200,6);
        b.displayInfo();
        b.start();

        Vehicle v1 = new Vehicle("Mahindra",300);
        v1.displayInfo();
        v1.start();
//      Method Overriding
        Vehicle v2 = new Car("Hero",500,5);
        v2.displayInfo();
        v2.start();;

//        Method Overloading
        b.start("Hoooooo");
    }
}
