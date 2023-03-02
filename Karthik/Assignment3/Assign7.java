package Karthik.Assignment3;

public class Assign7 {

    int i=88;

    void printNum(){

     System.out.println("The value of i is: "+i);
    }
    public static void main(String[] args) {
       // Assign7 A7 = new Assign7();
        //.printNum();
        Assign7sub A8=new Assign7sub();
        A8.i=78;
        A8.j=87;

        A8.printNum();

    }
    
}
