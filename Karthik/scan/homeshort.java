package Karthik.scan;
import java.util.*;

public class homeshort {
    
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        short num;
    do{
        System.out.println("enter float number");
        while(!obj.hasNextShort()){
        
            System.out.println("Please enter a float number");
            obj.next();

        }  num = obj.nextShort();
     } while(num<=0);
        System.out.println("Your number is " + num);
    
    }


}
