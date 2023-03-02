package Karthik.Assignment3;

public class BankA extends Bank {

    public int getBalance(){
     //  super.getBalance();
        int i= super.getBalance();
        System.out.println("the initial deposit amount: "+i);
      //  System.out.println("a boy has money deposited in Bank A is $1000");
       return 1000;
        
    }
    
}
