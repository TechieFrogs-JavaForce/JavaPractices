package Karthik.Oops;

public class GrandParent {
    int a=90;
    String sta="hello guys" ;
    int b;

    void Disp1(){
        System.out.println("i am in grand parent class with Disp1");
    }
   static void display1(){
        System.out.println("i am in Grand parent");
       
     }
     GrandParent(){
        System.out.println(" i am in constructor method in Grand parent");

     }


    public static void main(String args[]){

        GrandParent obj3=new GrandParent();
        obj3.a=67;
        System.out.println(obj3.a);
        

    }

    
}



