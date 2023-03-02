package Karthik.Oops;
 import Karthik.Interface.MyInterface1;


    public class MyClass {
        protected class MyInnerClass implements MyInterface1 {
            public void doSomething() {
                System.out.println("Inner class doing something");
            }
        }
    }
    

