package Karthik.AssignAbstract;

//import Karthik.Assignment3.Assign7;

abstract public class Assign4Abs {

    Assign4Abs(){
        System.out.println("This is constructor of abstract class");
    }

    abstract void a_method();

    void method(){
        System.out.println("This is normal method in abstarct class ");

    }

}    

class Asin4_Sub extends Assign4Abs{

    @Override
    void a_method() {
        System.out.println("This is a abstract method");
        // TODO Auto-generated method stub
        
    }

   public static void main(String[] args) {
    
   

        Assign4Abs objAss4=new Assign4Abs(){
            void a_method() {
                
            }};
         objAss4.a_method();
         objAss4.method();

        // Asin4_Sub objA4=new Asin4_Sub();
        // objA4.a_method();
       

    }
}
    

