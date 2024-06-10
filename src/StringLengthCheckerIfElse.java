public class StringLengthCheckerIfElse {

    public static void checkStringLengthIfElse(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        if (str.isEmpty()) {
            System.out.println("empty");
        } else if (str.length() <= 10) {
            System.out.println("short");
        } else {
            System.out.println("long");
        }
    }

    public static void main(String[] args) {
        checkStringLengthIfElse("Hello");
        checkStringLengthIfElse("");
        checkStringLengthIfElse("This is a long string");
    }
}
