package Karthik.scan;
import Karthik.Oops.ProEx1;

public class ProEx2 extends ProEx1{

    int o=87;
    String Str1="karthik1999";
    final int k;
    static final int Y;

    {
        System.out.println("in IIB block");
     k=77;
     //y=55;
    }
static
   {
    System.out.println("in SiB block");
      Y=55;
   } 

    ProEx2(){
      //  k=88;
      //y=77;
        System.out.println(" constructor");
    }
    ProEx2(int a){
       // y=90;
     // k=90;
        System.out.println(" ka");
    }



    public static void main(String args[]){
        ProEx2 kk= new ProEx2();
        //ProEx2 kk= new ProEx2();
       // ProEx1 ks=new ProEx1();

        kk.display();
        kk.Name();
       // kk.k=79;
        System.out.println(kk.i+" "+kk.Y+" "+kk.k);
    }
    
}
