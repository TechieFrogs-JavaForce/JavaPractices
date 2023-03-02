package Karthik.Strings;

public class StringClass {

     

     //By using string ilterlal it makes more efficient
                                                  


    public static void main(String[] args) {
        String str="Karthik123";// String literal -->it first checks the string constant pool if doesnt exit it creates a new string instance

     String str2="Karthik123";  //doesnt create new instance because already exist

     String str3="Java"; //create a new instance

     String str4="KaRThik123";
     String str6 ="kapthik";
     String str7="Karthik723";
        
        StringClass stOb1=new StringClass(); 
        
        String str5=new String("Karthik123");// string object by new keyword

       String s="Sachin ";

        s=s.concat("Tendulkar");

        String str8="new"+ "java";

    //     System.out.println(s);

    //    System.out.println(str5);

    //     System.out.println(str);

    //     System.out.println(str.equals(str2)); //true

    //     System.out.println(str.equals(str4)); //false

    //     System.out.println(str.equalsIgnoreCase(str4)); //true

    //     System.out.println(str == str5); // double equal method check for values and references ,,, equal operator only check for values


        // System.out.println(str.compareTo(str2));//
        // System.out.println(str.compareTo(str3));
        // System.out.println(str3.compareTo(str));
        System.out.println(str.compareTo(str6));
        System.out.println(str.compareTo(str4));
        System.out.println(str.compareTo(str7));

        System.out.println(str.concat(str3));
        System.out.println(str8);

        String s2="String Class";
               //  01234567891011
        String s3="   Hello " ;      
        System.out.println(s2.substring(0));
        System.out.println(s2.substring(7,12));// starting of the index is inclusive and ending is exclusive
        System.out.println(s3.trim() );

        System.out.println(s2.startsWith("St"));
        System.out.println(s2.endsWith("SS"));

        System.out.println(s2.charAt(2));
        System.out.println(s2.charAt(3));
        System.out.println(s2.length());

        int d=88;
        String s4=String.valueOf(d);
        System.out.println(s4+45);
        System.out.println(s2.toUpperCase().concat(s3));

        String s5="Hello boys Hello";
        System.out.println(s5.replaceFirst("Hello", "java"));
        
       // System.out.println(s5.format());
       //System.out.println(s2.getBytes());












        


    }


    
}
