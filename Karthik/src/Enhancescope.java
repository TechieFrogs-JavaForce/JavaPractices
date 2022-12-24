public class Enhancescope {
    
        public static void main (String [] args){
            int a = 40;
            int b = switch(a){
                case 1 -> {
                    int j = 10;
                    System.out.println("1 case and j is "+j);
                    yield 1;
                }
                case 40 -> {
                    int j = 10;
                    System.out.println("2nd case and j is "+j);
                    yield 40;
                }
                default -> {
                    System.out.println("default");
                    yield 0;
                }
            };
        }
        
    }
    

