package Karthik.InhertiancePro;



public class Assignm2 {
    
    private void Disp1(){
        System.out.println("This is a parent class ");
    }
    public static void main(String[] args) {
        Assignm2 A=new Assignm2();
        A.Disp1();
        Assignm2sub B= new Assignm2sub();
        B.Dispsub1();
        //B.Disp1(); not visible
    }
    
}

class Assignm2sub extends Assignm2{

    public void Dispsub1(){
        
        System.out.println("This is child class");
    }
}

    

