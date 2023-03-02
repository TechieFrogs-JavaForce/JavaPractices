package Karthik.AssignAbstract;

abstract public class ParentAbs {

       void message(){
        System.out.println("This is abstarctrt class");
      }
    

    
}
class ChildAbsSub1 extends ParentAbs{

    void message(){
        System.out.println("This is first sub class");
    }

}
class ChildAbsSub2 extends ParentAbs{

    void message(){
        System.out.println("This is second subclass");
    }

    public static void main(String[] args) {
        ChildAbsSub2 objAbsSub2=new ChildAbsSub2();
    
       objAbsSub2.message();

       ChildAbsSub1 objAbsSub1= new ChildAbsSub1();
       objAbsSub1.message();

       ParentAbs objAbs=new ParentAbs(){}; 
        
       objAbs.message();

        
       
        
    }

}