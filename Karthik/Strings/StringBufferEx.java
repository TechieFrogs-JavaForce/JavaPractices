package Karthik.Strings;

public class StringBufferEx {   //thread safe and synchronised one   

    public static void main(String[] args) {
        
        StringBuffer str1=new StringBuffer("lHello Team");  // initial default capacity is 16  >when it exceeds it defaults limit  uses new  formula to find capacity
                                                 //new capacity=old capacity*2+2
        
                                                
        str1.ensureCapacity(26);                                         
        str1.append("karthik") ;
        System.out.println(str1.length()+" "+str1.capacity());
        str1.append("original string is changed");

        str1.append(" now");

        str1.insert(0, "given ");

       // str1.replace(1, 3, "Karthik");
       

        System.out.println(str1.length()+" "+str1+" "+str1.capacity());

        str1.append(" java is my favorite languagge and i am");

        System.out.println(str1.length()+" "+str1+" "+str1.capacity());
        
       

        StringBuffer str2=new StringBuffer("Good morning "); //dou del
                                              // 0123456789 

        str2.append("karthik "); //instead of concate we change append because this is a stringbuffer mutable 

       // str2.insert(0, "hello! ");

       // str2.replace(1, 3, "java");

        str2.delete(5, 9);
        
        System.out.println(str2.capacity()+" "+str2.length()+" "+str2); //old capcity +16


       // str2.reverse();

       // System.out.println(str2.length()+" "+str2+" "+str2.capacity()+" ");



       
        StringBuffer str3=new StringBuffer('a');

        StringBuffer str4=new StringBuffer(20);

        str4.append("we are participating in java coding");

        System.out.println(str4.length()+" "+str4+" "+str4.capacity());

        str4.append(" on monday");
        System.out.println(str4.length()+" "+str4+" "+str4.capacity());


    }
    
}
