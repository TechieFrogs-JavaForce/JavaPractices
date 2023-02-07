package Karthik.AssignAbstract;

public abstract class Shape7As {

    protected String col;

    protected boolean b;

    abstract void getArea();

    abstract void getPerimeter();

    //  String toString(){
    //     return col;
        
    // }
    // void disop(){

    // }
   public  String toString(){
        return b+" "+col;

    }

    

    
}
class Circle7 extends Shape7As{

    
    void getArea() {
        
        
    }

    
    void getPerimeter() {
       
        
    }
   public String toString(){
        return col;

    }
    
}
class Rectangle extends Shape7As{

    
    void getArea() {
        // TODO Auto-generated method stub
        
    }

    
    void getPerimeter() {
    
        
    }
    public String toString(){
        return col;
    }
    
}