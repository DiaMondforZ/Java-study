package itheima.Test1;

public class Person {
    //属性
    private String name;
    private int age;
    private String gender;
    //构造方法
    public Person() {}
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //getter和setter方法
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    //行为
    public void drive(Vehicle vehicle) {
        //调用交通工具的move方法
        vehicle.move();
        //响铃、鸣笛
        if (vehicle instanceof Bicycle){
            Bicycle b = (Bicycle) vehicle;
            b.ringBell();
        }else if (vehicle instanceof Car){
            Car c = (Car) vehicle;
            c.honk();
        }else {
            System.out.println("请勿乱开");
        }
    }
}
