package Range;

public class Range {
    private String input;

    public Range(String input){
        this.input = input;
    }

    public boolean isStartWithInclusive() {
        return input.startsWith("(");
    }
}
