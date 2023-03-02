package Karthik.InhertiancePro;

public class ClassAA {
    int i;
    int j;
     public void show(){
        System.out.println("the value of i and j is "+i +"and"+j);
     }
    ClassAA(){
        System.out.println("this is constructor in AA method");

     }

    
}
class ClassBB extends ClassAA{
    int k;

    ClassBB(){
        System.out.println("This is a constructor in BB method");

    }

    public void show(){
        //super.show();
      System.out.println("The value of k is "+k);
    }

    public static void main(String[] args) {
        
        ClassBB b=new ClassBB();
        b.k=90;
        b.show();
        
    }

    

}
