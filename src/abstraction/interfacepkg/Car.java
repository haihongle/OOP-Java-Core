package abstraction.interfacepkg;

public class Car implements Vehicle {
    @Override
    public void run() {
        System.out.println("Car is running...");
    }
}
//Từ khóa implements: Thực thi/implement interface
//
//Bắt buộc triển khai: Phải cung cấp thân cho tất cả phương thức của interface
//
//Annotation @Override: Đánh dấu đang implement phương thức interface