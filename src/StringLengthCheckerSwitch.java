public class StringLengthCheckerSwitch {

    public static void checkStringLengthSwitch(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        int length = str.length();
        String lengthCategory;
        if (length == 0) {
            lengthCategory = "empty";
        } else if (length <= 10) {
            lengthCategory = "short";
        } else {
            lengthCategory = "long";
        }

        switch (lengthCategory) {
            case "empty":
                System.out.println("empty");
                break;
            case "short":
                System.out.println("short");
                break;
            case "long":
                System.out.println("long");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + lengthCategory);
        }
    }

    public static void main(String[] args) {
        checkStringLengthSwitch("Hello");
        checkStringLengthSwitch("");
        checkStringLengthSwitch("This is a long string");
    }
}
