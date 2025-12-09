package inheritance;

public class Dog extends Animal {
    public void bark () {
        System.out.println("Dog is barking");
    }

// bark() là phương thức MỚI của Dog
//
//Không có quan hệ ghi đè với Animal
//
//Animal class không có phương thức bark()

// Kế thừa (Inherit): Nhận được phương thức/biến từ class cha
}
