package Karthik.Oops;

public class Publicex {

    public static void main(String[] args){

    System.out.println("we can access everywhere even outside of the package");
     
    Aptitude s1=new Aptitude();
    // s1.i=90;
    s1.str="Karthik";
    // s1.d=98.90;
    s1.display();

    }
    
}
class Aptitude{
    int i=667;
    String str;
    double d;

    Aptitude(){
       // i=34;
        str="kick";
        d=89.98;


     
    System.out.println("this public modifier");

    }
    void display(){
        System.out.println(i+" "+str+" "+d);
    }

}