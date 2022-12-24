package Assignments;

public class palindrome {
    public static void main(String args[]) {
        int num = 121; int temp=num;
        int rev =0;
        
        while(num!=0){ //121!=0  
            rev=rev*10+num%10; //0*`10+12=1
            num=num/10;
            
            
        }
        System.out.println(rev+ " "+num);
        
        if(rev==temp){
            System.out.println(" it is a palindrome number");
        }
        else{
            System.out.println("it is not a palindrome number");
        }
    }
}
