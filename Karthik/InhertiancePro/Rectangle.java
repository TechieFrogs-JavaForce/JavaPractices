package Karthik.InhertiancePro;

public class Rectangle {

    int length;
    int breadth;

    public void areadisp(){
        System.out.println("the area of the rectangle "+length*breadth);

    }
    public void peridisp(){
     System.out.println("the perimeter of the rectangle "+2*(length*breadth));

    }


    public Rectangle(int len,int bre){
        this.length=len;
        this.breadth=bre;

        //int length=5;
        //int breadth=5;

    }
    public static void main(String[] args) {
        
        Rectangle rec=new Rectangle(8,8);
        rec.areadisp();
        rec.peridisp();

        Square sq=new Square(3);
        sq.areadisp();
    }


}   
class Square extends Rectangle{

    public Square(int s){
        super(s,s);

       // int s=4;
      // System.out.println("the area of square "+s*s);

    }
} 

