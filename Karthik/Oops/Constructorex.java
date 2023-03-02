package Karthik.Oops;

public class Constructorex {
   public int k=5;
    String str="student";

        public static void main(String args[]) {
            Student S1 = new Student();
           // Student S2 = new Student(1,"avanthi");
            S1.display();
            //S2.display();
            
        }
    }
 class Student{
        int i;
        String name;
        

        
        
         Student(){
            System.out.println("no argument constructor ");
        }
        // Student(int num, String str){
        //     i=num;
        //     name="str";
        //     System.out.println("parameterized constructor");
        // }
        void display(){
         System.out.println(i+" "+name);}
        
    }
    

