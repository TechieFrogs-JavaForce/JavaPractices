package Karthik.Assignments2;

public class Assign2 {
    
    

    public static void main(String args[]){ 
        
        Student10 sam= new Student10();
        sam.roll_no=31;
       sam.ph_no=9182758922l;
       sam.address="(5-21, hyderabad)";
        

        Student10 John= new Student10();
        John.roll_no=32;
        John.ph_no=9618724536l;
        John.address="(8-34, Rajamundry)";
       // S2.name="john";

        System.out.println(sam.roll_no+" "+sam.address+" "+sam.ph_no);
        System.out.println(John.roll_no+" "+John.address+" "+John.ph_no);



    }
    
}
class Student10{
    int roll_no;
    long ph_no;
    String address;
    //String name;
   
}

