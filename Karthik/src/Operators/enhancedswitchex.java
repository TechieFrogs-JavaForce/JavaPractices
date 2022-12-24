package Operators;

public class enhancedswitchex {
    public static void main(String [] args){
        int itemCode = 005; 
        switch (itemCode) {
            case 001, 002, 003 : 
                System.out.println("It's an electronic gadget!");
                break;
                
            case 004, 005:
                System.out.println("It's a mechanical device!");
                break;
        }
        /*int val = switch (code) {
            case "x", "y" :
                yield 1;
            case "z", "w" :
                yield 2;*/

                String s = "abc";
                String text = switch (itemCode) {
                    case 001 : 
                        yield "It's a laptop!";
                    case 002 :
                        yield "It's a desktop!";        
                    case 003 :
                        yield "It's a mobile phone!";
                    default :
                        yield "Not matched";
                        //throw new IllegalArgumentException(itemCode + "is an unknown device!");
                };  
                
                System.out.println(text);
    }
}