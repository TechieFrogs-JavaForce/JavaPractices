package Karthik.Oops;

 class condemo {
     public static void main(String args[]) {
            Student S1 = new Student();
            Student S2 = new Student(1, "Avanthi");
            //Student s3= new Student(7);
         //  S1.display();
           // S2.display();
           System.out.println(S1.i+" "+S1.name);
            System.out.println("sys");
            
        }
    }
 class Student{
        int i;
        String name;
        Student(){

            
        }

        
        
        //  public Student(){
        //     i=p;

        //     System.out.println("no arg constructor ");
        // }
        Student(int num, String str){
            i=num;
            name="str";
            System.out.println("parameterized constructor");
        }
      //  void display(){
        // System.out.println(i+" "+name);}
        
  //  }
    


    
}
