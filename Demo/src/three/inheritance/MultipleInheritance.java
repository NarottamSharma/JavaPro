package three.inheritance;

public class MultipleInheritance {
    interface Dog {
        default void sound() {
            System.out.println("Dog barks");
        }
    }

    interface Cat {
        default void sound() {
            System.out.println("Cat meows");
        }
    }

    public class HybridAnimal implements Dog, Cat {
        @Override
        public void sound() {
            Dog.super.sound();
//            Cat.super.sound();
        }
    }

    public static void main(String[] args) {
        MultipleInheritance outer = new MultipleInheritance();
        HybridAnimal hybrid = outer.new HybridAnimal();
        hybrid.sound();
    }
}
