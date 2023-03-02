package Karthik.InhertiancePro;

public class PurchaseItem {

    private String name;
    private double unit_price;
    
    PurchaseItem(){
        
    }


    PurchaseItem(String str,double d){
        this.name=str;
        this.unit_price=d;

    }
    public double getprice(){
        return unit_price;
        

    }
    
}
class weighedItem extends PurchaseItem{
   private double weight; 


}
class CountedItem extends PurchaseItem{
   private int quantity;
   public CountedItem(){

   }


}