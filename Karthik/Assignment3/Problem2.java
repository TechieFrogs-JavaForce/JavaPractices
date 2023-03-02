package Karthik.Assignment3;

public class Problem2 {
    
    void printn1(int n, char c){
        System.out.println("printing integer and character: "+n+" "+'c');
    }
    void printn1(char c,int n){
        System.out.println("character and integer datatype: " +'c'+" "+n);
    }

    public static void main(String[] args) {
        Problem2 obj2=new Problem2();
        obj2.printn1(97,'k');
        obj2.printn1('k',765);
    }
    
}
