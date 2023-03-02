package Karthik.scan;
import java.util.*;

public class Homefloat {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float ft;
    do {
        System.out.println("Please enter a number");
        while (!obj.hasNextFloat()) {
            System.out.println("That's not a float number!:");
            obj.next(); 
        }
        ft= obj.nextFloat();
    } while (ft<=0);
    System.out.println("your number is " +ft);
    }
}
