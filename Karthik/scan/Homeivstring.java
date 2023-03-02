package Karthik.scan;
import java.util.*;

public class Homeivstring {

    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String s;
        System.out.println(" enter any statement");
        while(!obj.hasNextInt()){
            System.out.println(" enter any statement");
            obj.next();
        }
        System.out.println("I got string as an input");
    }
    
}
