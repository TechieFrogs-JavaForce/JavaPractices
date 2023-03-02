package Karthik.scan;
import java.util.*;

public class homebyte {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        byte b;;
        do {
            System.out.println("Please enter a byte");
            while(!obj.hasNextByte()) {
                System.out.println("That's not a float number!:");
                obj.next(); 
            }
            b= obj.nextByte();
            System.out.println("your number is " +b);
        } while (b<=0);
      
        }
    
    }

    

