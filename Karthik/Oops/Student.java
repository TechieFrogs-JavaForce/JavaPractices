package Karthik.Oops;

public class Student {
    int i;
    String str;

    public Student(){

        System.out.println("example of default constructor");
    }
    void display(){
        System.out.println(i+" "+str);
    }
}

class demo{

    public static void main(String[] args){

       Student s1=new Student();
       s1.i=67;
       s1.str="syttugh";
        s1.display();




    }
}
