package Karthik.Assignment3;

public class Customer{ 
    String name;
    String address;
    long Ph_no;
   // long account_no;


    
    
}
class account{
   long account_no;
   String ifsc_code;
   String Branch_name;


}
class RBI{
    int min_bal;
    int max_with;
    Customer address;
    Customer name;
    Customer Ph_no;
    account ifsc_code;
    account Branch_name;
    account account_no; 

    public double GetInterestRate(){
        return 0.04;

    }
    public double GetWithdrawlLimit(){
       return 0.04;

    }



}
class SBI extends RBI{


}
class ICICI extends RBI{

}
class PNB extends RBI{

}
