package Karthik.Oops;

 public class Classinstant {
   public int a=30;
    String str="avanthi";
    static String clg="eiu"; 

     public static void main(String[] args){
        

        Classinstant obj1=new Classinstant();
          System.out.println(obj1.a+" "+obj1.str+" "+clg);
       
       Classinstant kobject=new Classinstant();
        kobject.a=89;
        kobject.str="hello";
       // kobject.str="987";
        clg="0i8";
        System.out.println(kobject.a+" "+kobject.str+" "+clg);
        System.out.println(kobject.a+" "+kobject.str+" "+clg);
    }
    
}
