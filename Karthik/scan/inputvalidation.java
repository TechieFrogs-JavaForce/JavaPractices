package Karthik.scan;
import java. util.*;

public class inputvalidation { 
    public static void main(String args[]){ 
    Scanner obj= new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age= obj. nextInt();
    
    while (age<0 || age>100 ){
        System.out.println("thats not possible, try again");
        age= obj. nextInt();
        
       

    }System.out.println("your age is "+age);
      obj.close();
    


    }
    
}
