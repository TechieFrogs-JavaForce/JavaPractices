package Karthik.AssignAbstract;

public abstract class Shape {

    abstract void rectangleArea(int l,int b);

    abstract void squareArea(int s);

    abstract void circleArea(int r);


    
}
class Area extends Shape{

    // int l;
    // int b;
    // int s;
    // int r;
    int area;

    @Override
    void rectangleArea(int len,int bre) {
        
        area=len*bre;
        System.out.println("The area of rectangle is "+area);
        // TODO Auto-generated method stub
        
    }

    @Override
    void squareArea(int side) {
        area=side*side;
        System.out.println("the area of square is "+area);
        
    }

    @Override
    void circleArea(int radius) {
        area =radius*radius;
        System.out.println("The area of a circle is "+area);
        
    }
    public static void main(String[] args) {
        Area ar=new Area();
        ar.circleArea(4);
        ar.rectangleArea(4, 5);
        ar.squareArea(5);
    }
    // Area(int len,int bre){
    //     this.l=len;
    //     this.b=bre;
    //     area=l*b;
    //     System.out.println("The area of rectangle is "+area);
        
         
    // }
    // Area(int side){
    //     this.s=side;
    //     System.out.println("The area of square is  ");
    // }



}
