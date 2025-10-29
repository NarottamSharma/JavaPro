package three.inheritance;

public class InheritanceDemo {
    static void main(String[] args) {
        Car c1 = new Car("Toyota",25,5);
        c1.displayInfo();
        c1.info();
        Bike b = new Bike("Honda",200,6);
        b.displayInfo();

    }
}
