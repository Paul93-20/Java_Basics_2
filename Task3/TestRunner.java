package Task3;

public class TestRunner {
    public static void main(String[] args) {
        Runner[] runners = new Runner[2];
        runners[0] = new Runner("Вася", 65, 9);
        runners[1] = new Runner("Петя", 75, 10);

        Obstruction[] obstructions = new Obstruction[2];
        obstructions[0] = new Obstruction("номер 1", 9, 66);
        obstructions[1] = new Obstruction("номер 2", 5, 60);

        for (Runner runner : runners){
            for(Obstruction obstruction : obstructions){
                if (runner.getRunLimit() >= obstruction.getObsLength() && runner.getJumpLimit() >= obstruction.getObsHeight()){
                    System.out.println("Бегун " + runner.getName() + " пробежал полосу препятствий " + obstruction.getObsTitle());
               }else{
                   System.out.println("Бегун " + runner.getName() + " не смог пробежать полосу препятствий " + obstruction.getObsTitle());
               }
            }
        }
    }
}



