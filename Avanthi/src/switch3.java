public class switch3 {
    public static void main(String[] args){
        int itemCode = 001;
        switch (itemCode) {
            case 001 : 
                System.out.println("It's a laptop!");
                // missed out break here 
            case 002 :
                System.out.println("It's a desktop!");
                break;
    }
    
    }
}
