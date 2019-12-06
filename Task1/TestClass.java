package Task1;

public class TestClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mini", 3);
        Human human1 = new Human("Paul", "JavaRusher", 26);
        Robot robot1 = new Robot("Bender", 2, 7300.1);

        cat1.jumpMethod();
        cat1.runMethod();
        robot1.jumpMethod();
        robot1.runMethod();
        human1.jumpMethod();
        human1.runMethod();
    }
}
