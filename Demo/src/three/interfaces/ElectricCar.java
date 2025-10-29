package three.interfaces;

public class ElectricCar implements carControl{


    @Override
    public void turnright() {
        IO.println("Electric Right");

    }

    @Override
    public void turnleft() {
        IO.println("Electric left");
    }
}
