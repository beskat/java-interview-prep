package enums;

public enum Color {
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    private final String code;

    // Constructor for the enum
    Color(String code) {
        this.code = code;
    }

    // Method to get the color code
    public String getCode() {
        return code;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Color{" +
                "name=" + name() +
                ", code='" + code + '\'' +
                '}';
    }
}
