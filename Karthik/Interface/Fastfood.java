package Karthik.Interface;

public interface Fastfood {
    void prepare();
   void cook();
   void serve();
}

class Sandwich implements Fastfood {
   @Override
   public void prepare() {
      System.out.println("Preparing ingredients for sandwich");
   }

   @Override
   public void cook() {
      System.out.println("Cooking sandwich");
   }

   @Override
   public void serve() {
      System.out.println("Serving sandwich");
   }

   public static void main(String[] args) {
      Sandwich s1=new Sandwich();
      s1.prepare();
      
   }
}
    

