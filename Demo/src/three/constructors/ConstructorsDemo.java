package three.constructors;


    public class ConstructorsDemo {
        static void main(String[] args) {
            Car car1 = new Car("Mercedes",300,"Royal Gold"); // car class object created
//            car1.speed=100;
//            car1.brand = "Mercedes";
//            car1.color = "white";
            car1.drive();

//          setter and getter
            Car car2 = new Car("Axle",20,"blue");
            IO.println(car2.getSpeed());
            car2.setSpeed(500);
            IO.println(car2.getSpeed());



        }
    }