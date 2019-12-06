package Task2;

public class Runner {
    private String name;
    private int runLimit;
    private int jumpLimit;
    public Runner(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    public String getName() {
        return name;
    }
}
