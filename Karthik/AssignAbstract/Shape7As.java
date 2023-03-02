package Karthik.AssignAbstract;

public abstract class Shape7As {

    protected String col;

    protected boolean b;

    abstract void getArea();

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

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

    
    public  String str;
    void getArea() {
        System.out.println("This circle area");
        
        
    }

    
    void getPerimeter() {
        System.out.println("This is circle perimeter");
       
        
    }
   public String toString(){
        return col;

    }
    
}
class Rectangle extends Shape7As{

    
    private String str;
    void getArea() {
        System.out.println("this is rectangle area");
        // TODO Auto-generated method stub
        
    }

    
    void getPerimeter() {
        System.out.println("This is rectangle perimeter");
    
        
    }
    public String toString(){
        return col;
    }
    public static void main(String[] args) {
        Circle7 c1=new Circle7();
        Rectangle r1=new Rectangle();
        c1.getArea();
        c1.getPerimeter();
        r1.getArea();
        r1.getPerimeter();
        System.out.println(c1.str="Student2");
        System.out.println(r1.str="Student22");
    }
    
}