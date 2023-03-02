package Karthik.NestedEx;

import Karthik.Oops.Classinstant;
import Karthik.Oops.Interfa;

public class ClassInClass {

    int a=88;

    String str1="hello";

    void msg(){
        System.out.println("method in classinclass");
    }

    interface interface1{
        int y=88;
        void msg1();

    }

    // ClassInClass obj2=new ClassInClass();
    // ClassInClass.interface1 obj3=obj2. new interface1(){
    //     void msg1{
            

        
    class TestClass implements interface1{

        @Override
        public void msg1() {
            System.out.println("interface method");
            
        }

        //TestClass opb1=new TestClass();
        ClassInClass.interface1 ob12=new interface1() {
         
        };
        

    }
    
}
class MyClass1 implements ClassInClass.interface1{
    public static void main(String[] args) {
       
    }

    @Override
    public void msg1() {
        // TODO Auto-generated method stub
        
    }

}
