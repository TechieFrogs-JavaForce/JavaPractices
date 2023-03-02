package Karthik.Oops;

public class ParentAbstractMethodEx extends GrandParentAbstract {

    ParentAbstractMethodEx(){
        super(99);
        System.out.println("this is constructor belongs to parent ");
    }
    
        //@Override
        void disp11() {
            System.out.println("this is method in parentabstarct method ");
            // TODO Auto-generated method stub
            
        }
        //abstract void dispaly();
        public static void main(String[] args) {
            ParentAbstractMethodEx pam=new ParentAbstractMethodEx();
            pam.disp11();
            pam.dispMethod1();
    
            //System.out.println("pam.i"+" "+pam.str);
            
    
    
    
        }
    
    }
    
    
        
            
            
            
        
    }
    
    
}
