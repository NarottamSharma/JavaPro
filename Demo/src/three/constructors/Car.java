package three.constructors;

public class Car {
    String brand;
    String color;
    int speed;

    public Car(String brand, int speed,String color){
        IO.println("Constructor Created");
        this.brand = brand;
        this.speed = speed ;
        this.color=color ;
    }

    public void drive(){
        System.out.println(brand+" is driving at "+speed);
    }
//    setter and getter
    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
