package Karthik.Assignments2;


//import Karthik.Oops.Constructorex;

public class Assign1 {
    

    public static void main(String args[]){

        Student kobject= new Student();
        //Constructorex conObject= new Constructorex();
       // System.out.println("this is my object we used" +conObject.k);

        kobject.roll_no = 2;
        kobject.name="John";

        System.out.println(kobject.roll_no+" "+kobject.name);

    }
}
class Student{
   int roll_no;
    String name;
}
    
    
    

    
    


    

