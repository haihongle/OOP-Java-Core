import abstraction.abstractclass.DogAbs;
import abstraction.interfacepkg.Car;
import encapsulation.Student;
import inheritance.Dog;
import polymorphism.AnimalPoly;
import polymorphism.CatPoly;
import polymorphism.DogPoly;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("=== Encapsulation ===");
        Student s = new Student();
        s.setName("Hai");
        s.setAge(25);
        System.out.println(s.getName() + " - " + s.getAge());

        System.out.println("\n=== Inheritance ===");
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("\n=== Polymorphism ===");
        AnimalPoly a1 = new DogPoly();
        AnimalPoly a2 = new CatPoly();
        a1.sound();
        a2.sound();

        System.out.println("\n=== Abstraction - Abstract Class ===");
        DogAbs da = new DogAbs();
        da.sound();

        System.out.println("\n=== Abstraction - Interface ===");
        Car car = new Car();
        car.run();
    }
}