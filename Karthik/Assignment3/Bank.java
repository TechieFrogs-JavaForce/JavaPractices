package Karthik.Assignment3;

public class Bank {
    
    public int getBalance(){

        return 0;
    }
    public static void main(String[] args) {

        Bank q =new Bank();
        int y= q.getBalance();
        System.out.println("initial amount is "+y);
        

        BankA obj1 =new BankA();
        //super.Bank();
       int k= obj1.getBalance();
        System.out.println("a boy has money deposited in Bank A is "+k);

        BankB obj2 = new BankB();
        int l=obj2.getBalance();
         System.out.println("a boy has money deposited in Bank B is "+l);
        BankC obj3= new BankC();
       int p= obj3.getBalance();
       System.out.println("a boy has money deposited in Bank C is "+p);
    }
}
