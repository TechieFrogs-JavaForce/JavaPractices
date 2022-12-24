public class Enhancenew {
    
        public static void main (String [] args ){
            int i=30;
            int a = switch(i){
                case 10 -> {
                    System.out.println("10");
                    yield 10 ;
                }
                case 20 -> {
                    System.out.println("20");
                    yield 20 ;
                }
    
                case 30 -> {
                    System.out.println(("30"));
                    yield 30;
                }
    
                default -> {
                    System.out.println("0");
                    yield 0;
                }
            };
            System.out.println("value is "+i);
            
        }
        
    }
    

