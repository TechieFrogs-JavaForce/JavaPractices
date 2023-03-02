package Karthik.Assignments2;
//import java.math.*;
public class Assign3 {

    public static void main(String[] args){
        Triangle a1= new Triangle();
        // a1.s1
        // a1.s2
        // a1.s3
        //a1.area=(s1*s2)/2;
        //area=(s1*s2)/2;
        
        
        //System.out.println(a1.s1+" "+a1.s2+" "+a1.s3);
        System.out.println(a1.area+" "+a1.peri);

        
    }
    
}
class Triangle{
    int s1=3;
    int s2=4;
    int s3=5;
   double area=(s1+s2)/2;
    double peri=s1+s2+s3;

    Triangle(){
        

        
        System.out.println("Area of triangle");

    }
    //Triangle1(){
       // peri= s1+s2+s3;
      //  System.out.println("perimeter of the thtriangle");
    //}
    // void display(){
    //     System.out.println(area+" "+peri);
    // }
}
