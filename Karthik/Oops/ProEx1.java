package Karthik.Oops;

 public class ProEx1 extends Example1 {
   protected int i=99;
    String str="karthik";


   public void display(){
        System.out.println("i am in example in public ");
    }
    protected void Name(){
        System.out.println("i am in example in protected");
    }
    void Display(){
        System.out.println("i am in example in default");

    }
    private void Display1(){
        System.out.println("i am in example in private");
        

    }
    public ProEx1(){
        System.out.println("i am constructor");

    }
    protected ProEx1(int k,String namae ){
        System.out.println("i am protected constructor");
    }



    public static void main(String args[]){
        System.out.println("i am karthik");
        

    }
    
}
 class Example1{
  int k=66;
  

}