package Karthik.scan;
import java.util.*;

public class Nextline {
    public static void main(String args[]){ 
        Scanner obj= new Scanner(System.in);
        
        System.out.println(obj.delimiter());
        System.out.println("Enter your age: ");
        int age= obj. nextInt();
        System.out.print("Enter Name: ");
        String s=obj.next();                
        System.out.print("Enter boolean: ");
        Boolean b=obj.nextBoolean();
        obj.nextLine(); // \n
        System.out.print("Enter some sentence: ");
        String g=obj.nextLine(); 
        System.out.print("Enter your sal: ");
        float f=obj.nextFloat();
        System.out.println("the numbers are "+age+" "+s+" "+b+" "+g+" "+f);
    }
}
