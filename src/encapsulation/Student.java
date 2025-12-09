package encapsulation;

public class Student {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Đóng gói: Ẩn thông tin của đối tượng (biến private).
    //
    //Chỉ cho phép truy cập thông qua getter/setter.
}
