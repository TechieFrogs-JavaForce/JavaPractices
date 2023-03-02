package Karthik.Oops;

public class SubClass1 extends ParentClass {
   int j=98;
   double d=87.98;
   void KarthikDis(){
    System.out.println("i am in subclass");
   }
    
    public static void main(String args[]){
        SubClass1 obj=new SubClass1();
        System.out.println(obj.i);
        obj.Display();
        System.out.println(obj.str+" "+obj.d+" "+obj.getP()+" "+obj.setP(98));
        obj.KarthikDis();

        




    }

    
    
}
class Demoinher{
    int k=89;
    boolean b=true;
    void Disp1(){
        System.out.println("i am out of the class");
    }

}