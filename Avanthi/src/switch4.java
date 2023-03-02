public class switch4 {
    public static void main(String[] args){
        int itemCode = 003;
        switch (itemCode) {
            case 001 : 
                System.out.println("It's a laptop!");
                break;
            case 002 :
                System.out.println("It's a desktop!");
                break;
            case 003 :
                System.out.println("It's a mobile phone!");
                break;
            default :
                System.out.println("Unknown device!");
        }
    }
    
}
