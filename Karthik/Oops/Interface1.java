package Karthik.Oops;

interface Interface1 {
    int i=89;

    void meth1();
    static void disp(){
        System.out.println("this static void dis in interface 1");
    }

    
    default void method1(){
        System.out.println("this is default void method in interface1");
    }
    


}
interface Interface2{
    void meth2();
    static void disp(){
        System.out.println("in interface2 statoc mthod");
    }

    // default void method1(){
    //     System.out.println("this is default void method in interface2");
    // }
    
    public static void main(String[] args) {
        Interface2 ob2=new Interface2() {

            @Override
            public void meth2() {
                // TODO Auto-generated method stub
                
            }
            
        };
    }

}
interface Interface3{
    String name="team";

}
class Myclass implements Interface1,Interface2,Interface3{

    @Override
    public void meth1() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void meth2() {
        // TODO Auto-generated method stub
        
    }

    public void method1(){
        System.out.println("this is default void method in class");
        Interface1.super.method1();
    }
    public static void main(String[] args) {
        Myclass ob1=new Myclass();
        ob1.meth1();
        System.out.println(Interface1.i);
        Interface1.disp();
        ob1.method1();
    }
    
}
class MyClass2 extends Myclass{

}