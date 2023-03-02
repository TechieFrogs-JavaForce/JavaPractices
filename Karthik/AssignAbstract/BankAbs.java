package Karthik.AssignAbstract;

abstract public class BankAbs {

    abstract int getBalance();


    
}
class BankA extends BankAbs{

    @Override
    int getBalance() {
        // TODO Auto-generated method stub
        return 100;
    }

}
class BankB extends BankAbs{

    @Override
    int getBalance() {
        System.out.println();
        // TODO Auto-generated method stub
        return 150;
    }

}
class BankC extends BankAbs{

    @Override
    int getBalance() {
        // TODO Auto-generated method stub
        return 200;

    }
    public static void main(String[] args) {
        BankA B1=new BankA();
        int a=B1.getBalance();
        System.out.println("The amount deposited in BankA is "+a);
        

        BankB B2=new BankB();
        int b=B2.getBalance();
        System.out.println("The amount deposited in BankA is "+b);

        
        BankC B3=new BankC();
        int c=B3.getBalance();
        System.out.println("The amount deposited in BankA is "+c);
    }

}
