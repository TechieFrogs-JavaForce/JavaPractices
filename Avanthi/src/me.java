public class  me {
    public static void main(String[] args) {

        int number = 44;
        String size;
    
        // switch statement to check size
        switch (number) {
    
          case 1:
            size = "Small";
            break;
    
          case 2:
            size = "Medium";
            break;
    
          
          case 3:
            size = "Large";
            break;
    
          case 4:
            size = "Extra Large";
            break;
          
          default:
            size = "Unknown";
            break;
    
        }
        System.out.println("Size: " + size);
      }
    }
    
    

