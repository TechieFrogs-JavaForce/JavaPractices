package Karthik.Oops;

public class ParentClass extends GrandParent {
    int i=89;
    String str="karthik";
    // private int p=89;

    // public int getP(){
    //     return i;
        
    // }
    // public int setP(int k){
    //     this.i=k;
    //     return k;

    // }
     static void display1(){
        System.out.println("i am in parent class");

    }
    ParentClass(int b){
        System.out.println("i am a constructor in parent class");
    }

    public static void main(String args[]){
        ParentClass obj2=new ParentClass(87);
        System.out.println(obj2.i);
        obj2.b=99;



    }
    
}
