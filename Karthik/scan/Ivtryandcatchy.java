package Karthik.scan;
import java.text.NumberFormat;
import java.util.*;

public class Ivtryandcatchy {     
    public static void main(String args[]){
        int num=-1;
        
        Scanner obj= new Scanner(System.in);
        while(num < 0){
        System.out.println("enter any ; ");
        String input=obj.nextLine();

        try{
            num=Integer.valueOf(input);
        }
        catch(NumberFormatException e){
            num=-1;
        }
        
        }System.out.println("your integer is: "+num);


    }
}
