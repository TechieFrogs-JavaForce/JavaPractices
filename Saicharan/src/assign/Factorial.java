package assign;

public class Factorial {
    public static void main(String[] args) {
        int i, n = 1, number = 5;
        for (i = number; i >= 1; i--) {
            n = n * i;
        }
        System.out.println(n);
    }
}