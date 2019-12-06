package Task1;

public class Robot {
    String name;
    int age;
    double price;
    public Robot(String name, int age, double price){
        this.name = name;
        this.age = age;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void jumpMethod(){
        System.out.println(name + " прыгает");
    }
    public void runMethod(){
        System.out.println(name + " бегает");
    }

}
