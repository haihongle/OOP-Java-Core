package abstraction.abstractclass;

public abstract class AnimalAbs {
    public abstract void sound();
}
//Trừu tượng là ẩn đi chi tiết triển khai và chỉ hiển thị tính năng cần thiết

//Từ khóa abstract: Đánh dấu lớp là trừu tượng
//
//Phương thức trừu tượng: public abstract void sound()
//
//Chỉ có khai báo, không có thân phương thức
//
//Kết thúc bằng dấu ;
//
//Không thể tạo đối tượng: new AnimalAbs() sẽ gây lỗi compile

