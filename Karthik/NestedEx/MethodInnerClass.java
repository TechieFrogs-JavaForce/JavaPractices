package Karthik.NestedEx;

public class MethodInnerClass {
     int i=99;
    String str="Hello Guys";
    static int j=76;
    final static int k=28;
    
    //constructor
    MethodInnerClass(){
        System.out.println("constructor in Methodinnerclass");
    }
     //method
    void display1(){
        class LocalClass1{ //it should be abstract or default because we are giving method as default
            int a=66;
            int b;
            
            String str1="Hiteam";
             void display12(){
                System.out.println("dispaly method2 in localclass1 "+a+" "+b+" "+i+" "+r+" "+str);
             }

             static void display13(){
                System.out.println("static method in display13");
             }
            // abstract void display14();

             
        }
        LocalClass1 ob2=new LocalClass1();
             ob2.display12();
             LocalClass1.display13();
            // if(ob2.display12=88)
             


        System.out.println("display1 method");

    }
    static void display2(){
        int e=88;
        String str3="Karthik";
        class LocalClass2  {

        void display21(){
            System.out.println("display21 method in local class2 "+e+" "+str3+" "+r);

        }
        LocalClass2 ob3=new LocalClass2();
        ob3.display21();

    }
    abstract void display3();

    

    }
    public static void main(String[] args) {
        MethodInnerClass ob1=new MethodInnerClass();
        ob1.display1();
        MethodInnerClass.display2();
    }
    
    
}
