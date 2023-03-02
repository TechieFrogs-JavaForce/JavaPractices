package Karthik.Oops;

 class EncapDemo {

    private int i=100;
    private String stri="karthik";
    private char ch='k';
    public String getStr() {
        return stri;
    }
    public void setStr(String str) {
        this.stri = str;
    }
    public char getCh() {
        return ch;
    }
    public void setCh(char ch) {
        this.ch = ch;
    }
    public Boolean getB() {
        return b;
    }
    public void setB(Boolean b) {
        this.b = b;
    }

    private Boolean b=true;

    public int getI(){
        return i;
    }
    public void setI(int i){
       this.i= i;
        

    }

    EncapDemo(){
    }
}
public class EncapDemo1{
 public static void main(String args[]){

    EncapDemo oo=new EncapDemo();
    oo.getI();
   oo.setI(90);
    System.out.println("the required number is "+oo.getI()+" "+"and later i changed mr number");

    

}

}