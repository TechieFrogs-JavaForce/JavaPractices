package Karthik.Oops;

public class polyEx {
    void sum(int a,int b){
        System.out.println(a+b);
    
    }
    void sum(int a,float f){
        System.out.println(a+f);

    }



    public static void main(String[] args) {
     //   int a=add(11,22);
     System.out.println(adding.add(11,22));
     int a =adding.add(11,22,33);
     System.out.println(a);
     System.out.println(adding.add(89,"kaki"));
        adding.operator("jkarthik",99);
        adding.operator("karthik","good boy");//concatenate strings we only done with '+'operator
        polyEx kk=new polyEx();
        kk.sum(77,88);
        kk.sum(10,88.88f);
        

    }
    
}
//method over riding: having the same signature in parent class and child class*(at least need 2 classes)runt time poly
// method overloading: having the same name but different parameters.//but the function should be static(at least one class)compie time poly
class adding{

   static int add(int i,int j){//calling method with 2 parameters
        return i+j;
        
    }
  static  int add(int i,int j,int k){//calling method with 3 parameters
        return i+j+k;
    }
    //changing return type
    static String add(int i,int j,String str2){
        return i+j+str2;
    }
    static int add(int k,String str){
        return k;
    }
    static void operator(int a, int b){//calling operator with int values
        System.out.println(a+b);
    }
    static void operator(String str, int b){//calling operator with int and string
        System.out.println(str+b);
    }
    static void operator(String str1, String str2){
        System.out.println(str1+str2);
    }
  
}

