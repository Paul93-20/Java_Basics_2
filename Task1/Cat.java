package Task1;

public class Cat {
    String name;
    int age;
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public void jumpMethod(){
        System.out.println(name + " прыгает");
    }
    public void runMethod(){
        System.out.println(name + " бегает");
    }
}