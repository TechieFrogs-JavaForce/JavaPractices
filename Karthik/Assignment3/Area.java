package Karthik.Assignment3;

public class Area {

    void area(int l, int b){
        System.out.println("area of rectangle: " +l*b);
    }
    void area(int a){
        System.out.println("area of square: "+a*a);
    }

    public static void main(String[] args) {
        
        Area obj3=new Area();
        obj3.area(4,5);
        obj3.area(4);
    }
    
}
