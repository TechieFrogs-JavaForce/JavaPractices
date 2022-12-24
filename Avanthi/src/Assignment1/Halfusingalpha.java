package Assignment1;

public class Halfusingalpha {
    public static void main(String[] args){

        int i, j, n=5; 
        char p='A';
        for(i=1; i<=n; i++, p++){
            for(j=1; j<=i; j++){
                System.out.print((char)p+" " );
                
            }
            System.out.println();
        }
      
    }
}
    
