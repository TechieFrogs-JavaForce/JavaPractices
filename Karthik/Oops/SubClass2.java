package Karthik.Oops;

public class SubClass2 extends ParentClass {
   // int a=45;
    int c=67;
    String str="karthik1";
     public  static void display1(){
        System.out.println("i am in subclass 2 with hiding method");
       
     }
     public void Display(){
        System.out.println("i am in subclass 2");
    }
    SubClass2(int a){
        super(44);

        System.out.println("in sub class constructor");

       
    }
     public static void main(String args[]){
        SubClass2 kk=new SubClass2(98);
       // kk.display1();
      // kk.Display();
      // kk.a=67;
      //System.out.println(kk.a);
      //kk.display1();
      // kk.b=87;



     }
    
}
