package Karthik.Oops;

public class defaultex {
     public static void main(String[] args){

        System.out.println("we can access everywhere even outside of the package");
         
        Aptitude s1=new Aptitude();
        s1.i=90;
        s1.str="Karthik";
        s1.d=98.90;
        s1.display();
    
        }
        
    
    } class Aptitude{
       public int i;
        String str;
        double d;
    
       public Aptitude(){
    
    
         
        System.out.println("this public modifier");
    
        }
       public void display(){
            System.out.println(i+" "+str+" "+d);
        }
    
    }


