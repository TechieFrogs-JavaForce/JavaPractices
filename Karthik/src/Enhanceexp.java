public class Enhanceexp {
    public static void main(String [] args){
        int itemcode = 001;
        String  text = switch (itemCode) {
            case 001 : 
                yield "It's a laptop!";
            case 002 :
                yield "It's a desktop!";        
            case 003 :
                yield "It's a mobile phone!";
            default :
                yield "not a value ";    
    };
}

}
    

