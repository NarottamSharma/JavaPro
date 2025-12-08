package three.constructors.copyConstructor;

public class Main {
    static void main() {
        Movie original = new Movie("Inseption",145);
        Movie copy = new Movie(original);
        copy.displayDetails();
    }
}
