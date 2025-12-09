package polymorphism;

public class CatPoly extends AnimalPoly {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
// Đa hình : Một hành động có nhiều cách thực hiện khác nhau tùy vào đối tượng cụ thể
//Override ghi đè lên phương thức của class cha là AnimaPoLy