package Karthik.Oops;

public class Privateex {
    public static void main(String[] args){

        System.out.println("we can access only withion the class not outsid ethe class");
         
        Aptitude s1=new Aptitude();
        s1.i=90; //private  int
        s1.str="Karthik";//private string
        s1.d=98.90;
        s1.display();
    
        }
        
    }
     class Aptitude{
        private int i;
         private String str;
        double d;
    
        Aptitude(){
    
    
         
        System.out.println("this private modifier");
    
        }
        void display(){
            System.out.println(i+" "+str+" "+d);
        }
    
    }
    

