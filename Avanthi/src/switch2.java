public class switch2 {
    public static void main(String[] args){
        int itemCode = 005;
        switch (itemCode) {
            case 001, 002, 003 : 
                System.out.println("It's an electronic gadget!");
                break;
                
            case 004, 005:
                System.out.println("It's a mechanical device!");
                break;
        }

    }
    
}
