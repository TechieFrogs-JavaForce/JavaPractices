package Karthik.NestedEx;

import Karthik.Interface.Myclass;
import Karthik.NestedEx.StaticIn.StaticLocalInner.MyClass2;

public class MyClass extends StaticIn {
    int y=78;
    String str1="karthik";

    public static void main(String[] args) {
        // StaticIn obSt1=new StaticIn();
        // System.out.println(obSt1.str+" "+obSt1.i+" "+obSt1.q);
        // obSt1.staDisplay1();
        // StaticIn.staDisplay2();
        MyClass obMy1=new MyClass();
        System.out.println(obMy1.i+" "+obMy1.str+" "+obMy1.str1);
         StaticLocalInner obSta2=new StaticLocalInner();
         System.out.println(obSta2.p+" "+obSta2.str11);
         obSta2.lovInDisp1();
         StaticLocalInner.innerStatic();
         StaticLocalInner.MyClass1 ob2=obSta2.new  MyClass1();
        // StaticLocalInner.MyClass1 ob3=obMy1.new  MyClass1();
        StaticLocalInner.MyClass2 ob3=new StaticLocalInner.MyClass2();
        MyClass2 obmy3=new MyClass2();
        System.out.println(obmy3.f);
        System.out.println(StaticIn.StaticLocalInner.MyClass2.str4);


        




    
     }
    
}

// if we have two classes first we have to create object for 1st class and by using object we can write 
//2nd object
