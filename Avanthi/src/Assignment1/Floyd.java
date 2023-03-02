package Assignment1;

public class Floyd {
public static void main(String args[]) {
        int i, j, n=5, k=1;
      for(i=1; i<=n; i++){
          for(j=1; j<=i; j++, k++){
              System.out.print(k+" ");
          }
          System.out.println();
      }
    }
    
}
