package Karthik.Oops;
import java.util.*;

public class MethodsAndReturns {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first integer");
        int a =sc.nextInt();
        System.out.println("enter second integer");
        int b =sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of the two numbers is "+sum);
        
      int sk= addaa(a,b);//function call
       System.out.println(sk);
      // addaa(a,b);
        
       


    }
    //function definition.
    public static int addaa(int a,int b){
      //  System.out.println(a+b);
      //int sk=a+b;
      return a+b;
        
    }

}
