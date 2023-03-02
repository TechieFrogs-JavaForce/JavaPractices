package Karthik.Interface;

public interface MyInterface1 {
    int field1=10;
    int field2=20;
    
    
}
class MyClass1 implements MyInterface1 {
    public void changeFields() {
       
     //  field1 = 30;
       //field2 = 40;

       
    }
    public static void main(String[] args) {
        System.out.println(MyInterface1.field1);
        
    }
 }
