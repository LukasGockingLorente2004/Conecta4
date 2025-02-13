
public enum Token {
    Empty("."),
    Circle("O"),
    // ...
    Cross("X");

    public final String label;

    private Token(String label) {
        this.label = label;
    }
}


