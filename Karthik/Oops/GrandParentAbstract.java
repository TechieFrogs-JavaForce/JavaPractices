package Karthik.Oops;

public  abstract class GrandParentAbstract {

     int i=88;
     String str = "karthik";


     abstract void disp11();

    static void staticmethod(){
        System.out.println("This is static mthod in grandparent abstarct method");
    }
    void dispMethod1(){
        System.out.println("This is a normal display method in grandparent");

    }
    GrandParentAbstract(){
        System.out.println("This is a GrandParentAbstract conctructor");
    }
    GrandParentAbstract(int k){
        System.out.println("This is my int constructor in GPA class");
    }


    // public static void main(String[] args) {
    //    // GrandParentAbstract gpa=new GrandParentAbstract() {
            
    //    // };
    // }
    
}




    
        
        
        
    

