package Assignments;

public class diamondshape {
    public static void main(String args[]) {
        int i, j, k, n=5;
        for(i=1; i<n; i++){
            for(k=i; k<=n; k++){
                System.out.print("  ");}
                for(j=1; j<i; j++){
                System.out.print("* ");}
            
                for(j=1; j<=i; j++){
                System.out.print("* ");}
                
             System.out.println();   
        }    
            
        
        for(i=1; i<=n; i++){
            for(k=1; k<=i; k++){
                System.out.print("  ");}
                for(j=i; j<n; j++){
                System.out.print("* ");}
            
                for(j=i; j<=n; j++){
                System.out.print("* ");}
            
            System.out.println();
        }
        
    }
    
}
