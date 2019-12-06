package Task1;

public class Human {
    private String name;
    private String lastName;
    private int age;
    public Human(String name, String lastName, int age){
        this.name = name;
        this.lastName = name;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLasName(String lastName) {
        this.lastName = lastName;
    }
    public void jumpMethod(){
        System.out.println(name + " прыгает");
    }
    public void runMethod(){
        System.out.println(name + " бегает");
    }
}
