package Karthik.Oops;

public  abstract class Abs {

    abstract void method();
    Abs(){
        System.out.println("the");
    }

    Abs ob=new Abs(){
        public void method (){
            System.out.println("uuu");
        }

    }
    
    
}
