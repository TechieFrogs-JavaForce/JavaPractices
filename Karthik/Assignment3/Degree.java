package Karthik.Assignment3;

public class Degree {

    public void getDegree(){
        System.out.println("I got degree");

    }
    public static void main(String[] args) {
        Degree obj1=new Degree();
        obj1.getDegree();

        Undergraduate obju = new Undergraduate();
        obju.getDegree();

        Degree objp = new Undergraduate();
        objp.getDegree();

        
    }
    
}
 class Undergraduate extends Degree{
     
    public void getDegree(){
        System.out.println("i am undergraduate");
    }
    //public static void main(String[] args) {
      //  Undergraduate obj5= new Undergraduate();
       // obj5.getDegree();
    //}

}
class Postgraduate extends Degree{
    
    public void getDegree(){
        System.out.println("i am postgraduate");
    }
    public static void main(String[] args) {
        Postgraduate obj4 =new Postgraduate();
        obj4.getDegree();
    }

}
