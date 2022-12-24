public class Enhanceyield {
    public static void main(String[] args){
        int i=25;

        int k = switch(i){
            case 5 , 10, 20:
                System.out.println("value is 5");
                yield 5 ;
            case   25:
                System.out.println("value is 25");
                yield 25;
            default:
                System.out.println("dafault value");
                yield 0;

        };
        System.out.println("value of k is"+i);
            
    }
}
    

