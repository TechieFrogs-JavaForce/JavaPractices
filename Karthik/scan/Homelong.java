package Karthik.scan;
import java.util.*;

public class Homelong {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        long num;
        do{
            System.out.println("enter long number");
            while(!obj.hasNextLong()){
                System.out.println("it is not a float number");
                obj.next();
            }
        
        num=obj.nextLong();}
        while(num<0);
        System.out.println("this is u r number "+ num);


    }

    
}
