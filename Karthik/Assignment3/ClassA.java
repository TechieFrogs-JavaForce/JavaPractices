package Karthik.Assignment3;

public class ClassA {

    static void Disp(){
        System.out.println("it is a static method to print parent");
    }

    public static void main(String[] args) {
        ClassA ob1=new ClassA();
        ob1.Disp();
        ClassB ob2=new ClassB();
        ob2.Disp();
       ClassA A =new ClassB();
       A.Disp();
      ///  System.out.println();
    // ClassA.Disp();
     //lassB.Disp();
    }
    
}
