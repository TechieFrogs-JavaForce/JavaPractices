package assign.Assignment1.java;

public class Largest {
    public static void main(String[] args) {
        int a = 1900, b = 2000, c = 2000;
        int temp = 0, greater = 0;
        if (a >= b) {
            temp = a;

        } else {
            temp = b;
        }

        if (c > temp) {
            greater = c;
        } else {
            greater = temp;
        }
        System.out.println(greater);
    }

}