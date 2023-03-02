package Karthik.Oops;
import java.util.*;

public class Consover {
    
        public static void main(String args[]) {
            Student S1 = new Student();
            //tudent S2 = new Student(1, "Avanthi");
            Scanner sc=new Scanner(System.in);
            System.out.println("enter amn integer");
            int s1=sc.nextInt();
           // String s1=sc.next(); 

            Student S3 = new Student(199); 
           // Student s4 = new Student(90);
            Student s5 = new Student("kaki");
             S1.display();
            // S2.display();
            S3.display();
            // s4.display();
            // s5.display();
            System.out.println("this is my constructor");
           // S3.close();
            
        }
}
     class Student{
        int i;
        String name;
        //char Section;
        
         Student(){
            
            this("kart",98);
             
            System.out.println("no arg constructor ");
        }
        Student(int num, String str){
            this('l');
            i=num;
            name="str";
            System.out.println("parameterized constructor");
        }
        Student(int ar){
            //this(6,"Karthik");
            i= ar;
            System.out.println("only integer");
        }
        Student(String ak){
            this();
            
            name= "ak";
            System.out.println("only String");
        }
        Student(String str,int num){
            
            i=num;
            
            name ="str";
            System.out.println("Method over loading");
            
           
        }
        
        void display(){
         System.out.println(i+" "+name);}
        
}

