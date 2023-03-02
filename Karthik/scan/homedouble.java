package Karthik.scan;
import java.util.*;

public class homedouble {
    public static void main(String args[]){
    double number ; 
    Scanner obj=new Scanner (System.in);
    do {
        System.out.println("Please enter a number");
        while(!obj.hasNextDouble()) {
            System.out.println("That's not a number! Please enter number now:");
            obj.next(); 
            
        }
        number = obj.nextDouble();
    } while (number<=0);
    System.out.println("Thank you! Got " + number);
    }
    
}
