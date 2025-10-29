package three.encapsulation;

class Car {
    private String brand;
    private String color;
    private int speed;

    public Car(String brand, int speed,String color){
        IO.println("Constructor Created");
        this.brand = brand;
//        this.speed = -1 ; // in this directly we can use -ve value
        setSpeed(speed); // now we cant use -ve here
        this.color=color ;
    }

    public void drive(){
        System.out.println(brand+" is driving at "+speed+" and its color is "+color);
    }
    //    setter and getter
    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed<0)
            speed=0;
        this.speed = speed;
    }
}
public class EncapsulationDemo {
    static void main(String[] args) {
        Car car1= new Car("Mercedes",300,"blue");
        car1.drive();
        car1.setSpeed(-100);
        car1.drive();
    }
}
