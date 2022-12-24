package assign;

public class Alpha {
    public static void main(String[] args) {
        char c = '%';
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println("it is an alphabet");
        } else {
            System.out.println("it is not an alphabet");
        }
    }

}