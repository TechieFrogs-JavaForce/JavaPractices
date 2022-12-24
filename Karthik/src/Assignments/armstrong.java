package Assignments;

public class armstrong {
    public static void main(String[] args){
        int num=151, temp=num; int cubednum=0;
        while(num!=0){

            int reminder = num % 10;
            cubednum = cubednum +(reminder*reminder*reminder);
            num = num / 10;

        }
        if(temp==num){
            System.out.println(num+" it is armstrong number");
        }
        else{
            System.out.println(num+" it is not a armstrong number");
        }

    }
    
}
