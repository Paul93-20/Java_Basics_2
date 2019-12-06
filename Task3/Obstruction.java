package Task3;

public class Obstruction {
    private String obsTitle;
    private int obsHeight;
    private int obsLength;
    public Obstruction(String obsTitle, int obsHeight, int obsLength){
        this.obsTitle = obsTitle;
        this.obsHeight = obsHeight;
        this.obsLength= obsLength;
    }

    public String getObsTitle() {
        return obsTitle;
    }

    public int getObsHeight() {
        return obsHeight;
    }

    public int getObsLength() {
        return obsLength;
    }
}
