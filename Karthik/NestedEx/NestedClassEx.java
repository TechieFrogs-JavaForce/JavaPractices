package Karthik.NestedEx;

import Karthik.NestedEx.NestedClassEx.NestedInner.Nestedstatic1;

public class NestedClassEx {
//like parent class
     int i=76;
     private int j=54;
     String str="Hi Team";
     static int t=32;
     final static int q=76;
    

    void dispMeth1(){
   // NestedInner obj5=new NestedInner();
    //System.out.println(obj5.k);
        System.out.println("display method in nested main class");

    }
    static void display(){
        System.out.println();
    }

    NestedClassEx(){
        System.out.println("constructor in main nested class");
    }
  //Nested class

  //we can any access modifier to the nested class beacuse it act as a member of main class

   public class NestedInner{ 


        
        // inner class or non Static nested class
        //like child class
        //i=90;
        
        int k=9;
        //l=90;
        static int l=56;

        static class Nestedstatic1{
            int g=87;
            String str21="karthik";
            static String str3="Avanthi";
            public static void main(String[] args) {
                
            }
        }
        
        
       

        void dispMeth2(){
            i=65;
            j=76;//we can access private methods ,fields
            t=43;
            
            //q=99; we cannot change values final static variables 
        //     dispMeth1();
             System.out.println("display method in Nestedinner class "+q+" "+t);
         }
        //constructor
        NestedInner(){

            System.out.println("constructor in nestedinner class");
        }
        public static void main(String[] args) {
            System.out.println(NestedInner.l);
        }

    }
    public static void main(String[] args) {
        NestedClassEx obj1= new NestedClassEx();  //1 st object
        System.out.println(obj1.i+" "+obj1.str+" "+NestedClassEx.t+" "+NestedInner.l);
        obj1.dispMeth1();
       NestedClassEx.NestedInner innerobj=obj1.new NestedInner();  //2nd object //*creating inneerclass object
     Nestedstatic1 stob1=new Nestedstatic1();
      System.out.println(innerobj.k+" "+NestedClassEx.t+" "+obj1.i);
      innerobj.dispMeth2();
    NestedInner2 innerobj1 =obj1.new NestedInner2();
    System.out.println( innerobj1.b);
    NestedClassEx.NestedInner2.NestedInInner2 neOb1=innerobj1.new NestedInInner2();
     System.out.println(NestedClassEx.NestedInner.Nestedstatic1.str3);
    
     System.out.println(stob1.g);



      
    }

    class NestedInner2{
        int b=98;

        static class NestedIn1{
            int s=99;

        }

        class NestedInInner2{
            int a=78;

           static void dispInIner2(){
                System.out.println("disapmethod in innner class");
            }
            //public static void main(String[] args) {
                
            }
            static void main(String[] args) {
               // NestedInInner2 ob1=new NestedInInner2();'
               NestedInInner2.dispInIner2();
            }
            void method12(){
                NestedInInner2 obn=new NestedInInner2();
                System.out.println("method12");
            }

        }

    }

    
/*while if we want create ininner class object
     * 1 we have to create a outerclass obejct
     * 2 with object we have to create a inner class object and left hand we have to use a class chain
     * 3 lastv before object . new object class_name
     * for static fields and methods in inner classes we dont need to create a instance
     * dfor static classes we can 
    */
   // System.out.println(NestedClassEx.);
