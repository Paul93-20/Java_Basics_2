package Task2;

public class TestRunner {
    public static void main(String[] args) {
        Runner runner1 = new Runner("Вася",78, 7);
        Runner runner2 = new Runner("Петя", 64, 8);
        Wall wall1 = new Wall(5);
        Road road1 = new Road(65);

        if(runner1.getRunLimit()>= road1.getLength() && runner1.getJumpLimit()>= wall1.getHeight()){
            System.out.println("Бегун " + runner1.getName() + " пробежал полосу препятствий.");
        }
        else{
            System.out.println("Бегун " + runner1.getName() + " не смог пробежать полосу препятствий.");
        }
        if(runner2.getRunLimit()>= road1.getLength() && runner2.getJumpLimit()>= wall1.getHeight()){
            System.out.println("Бегун " + runner2.getName() + " пробежал полосу препятствий.");
        }
        else{
            System.out.println("Бегун " + runner2.getName() + " не смог пробежать полосу препятствий.");
        }
    }
}


