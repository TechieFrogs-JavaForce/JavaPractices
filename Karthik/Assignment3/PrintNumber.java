package Karthik.Assignment3;

public class PrintNumber {

    //example of method overloading
    void printn(){
        System.out.println("empty method");

    }

    public void printn(int x){
        System.out.println("integer data type: "+x );

    }
    void printn(int x,String str){
        System.out.println("integer and string data type: "+x+" "+str );

    }
   static void printn(int x,String str,char c){
        System.out.println("integer, string and char datatype: "+x+" "+str+" "+c);
        
    }
    void printn(int x, double d){
        System.out.println("integer and double datatype: "+x+" "+d);
    }

    public static void main(String args[]){

    PrintNumber obj1=new PrintNumber();
       obj1.printn(9);
       printn(8,"karthik",'A');//(for static we do nor need to create a instance)
       obj1.printn(88,"kk");
       obj1.printn(99,88.88);
       obj1.printn();
    }


}








