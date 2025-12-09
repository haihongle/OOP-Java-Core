package abstraction.abstractclass;

public class DogAbs extends AnimalAbs {
    @Override
    public void sound() {
        System.out.println("DogAbs");
    }
}
//Trừu tượng là ẩn đi chi tiết triển khai và chỉ hiển thị tính năng cần thiết

//Kế thừa lớp trừu tượng: extends AnimalAbs
//
//Bắt buộc ghi đè: Phải cung cấp triển khai cho tất cả phương thức trừu tượng
//
//Phương thức cụ thể: Cung cấp thân phương thức cho sound()

