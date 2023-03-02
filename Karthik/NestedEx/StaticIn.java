package Karthik.NestedEx;

//import Karthik.NestedEx.StaticIn.StaticLocalInner.MyClass1;

public class StaticIn {
    int i=88;
    String str="hi";
    static int q=76;
    private int l=87;

    void staDisplay1(){
        System.out.println("normal display1 method");
    }


    static void staDisplay2(){
        System.out.println("static method in display2");
    } 

    static class StaticLocalInner{//we can acces only static elements of static fields and methods
        int p=78;
        String str11="hi all";

        void lovInDisp1(){
            
            System.out.println("disp method in dtatic inner");
           // System.out.println(i);
           staDisplay2();
        }

        static void innerStatic(){
            System.out.println("static disp methiod in innerstatic");
        }
        

        class MyClass1{
            public static void main(String[] args) {
                
            }
            int h=987;
            

        }
        static class MyClass2{
            int f=88;
            static String str4="kk";
            
            

            void disp1s(){
                System.out.println("method imn static ");
            }
            public static void main(String[] args) {
                
            }

            abstract class Newclass{

                int d=90;

               abstract  void newDisp();

            }

        }
        public static void main(String[] args) {
            
        }
    }
    public static void main(String[] args) {
        StaticLocalInner.innerStatic();

        StaticLocalInner stOb1=new StaticLocalInner();
        System.out.println(stOb1.p);

       // Karthik.NestedEx.StaticIn.StaticLocalInner MyOb1= stOb1.new MyClass();
       StaticIn.StaticLocalInner.MyClass1 myOb1= stOb1.new MyClass1();
       System.out.println(myOb1.h);


       StaticIn.StaticLocalInner.MyClass2 myOb2=new StaticIn.StaticLocalInner. MyClass2();

    }

        
    
}

