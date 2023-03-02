package Karthik.InhertiancePro;

public class Shape {

    public void dispS(){
        System.out.println("This is shape");
    }
    
    
}
class Rectangle1 extends Shape{

    public void dispR(){
        System.out.println("This is recatangle shape");
    }

}

class Circle extends Shape{

    public void dispc(){
        System.out.println("This is circle shape");
    }

}

class Squares extends Rectangle1{

    public void dispsr(){
        System.out.println("square is a rectangle");

    }
    public static void main(String[] args) {
        
        Squares sq=new Squares();
        sq.dispS();
        sq.dispR();
    }
}
