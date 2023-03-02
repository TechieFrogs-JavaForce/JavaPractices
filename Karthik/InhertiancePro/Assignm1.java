package Karthik.InhertiancePro;

public class Assignm1 {

    public void disp(){
        System.out.println("This is a parent class ");
    }
    public static void main(String[] args) {
        Assignm1 A=new Assignm1();
        A.disp();
        Assignm1Sub B= new Assignm1Sub();
        B.dispsub();
        B.disp();
    }
    
}

class Assignm1Sub extends Assignm1{

    public void dispsub(){
        System.out.println("This is child class");
    }
}
