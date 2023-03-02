package Karthik.Oops;

interface  InterfaceEx1 {
 
    int l=99;
    public static final int k=65;
  
     void dog1();//public abstract by default

     void disp();
    void cat1();
    void kart();
    

    
}
interface InterfaceEx2{
    int l=200;
    void disp();
    void diplay();
    void kart();
}
class Dog1 implements InterfaceEx1, Interfa {

    @Override
    public void dog1() {
        // TODO Auto-generated method stub
        System.out.println("The dog barks");
        
    }

    @Override
    public void cat1() {
        System.out.println("The cat sounds like meow");
        // TODO Auto-generated method stub
        
    }
    public static void main(String[] args) {
        Dog1 d1=new Dog1();
        d1.cat1();
        d1.dog1();
        d1.diplay();
        d1.disp();
        System.out.println(Interfa.l);
    }

    @Override
    public void disp() {
        System.out.println("hello");
        // TODO Auto-generated method stub
        
    }
    // public void disp(){

    // }

    @Override
    public void diplay() {
        System.out.println("hiii all");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void kart() {
        // TODO Auto-generated method stub
        
    }

    
}
