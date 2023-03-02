package Karthik.Interface;


public interface RegularPolygon {
    int n=5;

        int getNumSides();
        double getSideLength();
      
       
        static int totalSides(){
            return 5; 
        }
      
        default double getPerimeter() {

            return getNumSides()*getSideLength();
            }

            default  double getInteriorAngel(){
                
                return (getNumSides()-2)*3.14/getNumSides();
            }
        
      }
      
class EquilateralTriangle implements RegularPolygon {
         double sideLength;
      
        public EquilateralTriangle(double sideLength) {
        this.sideLength=sideLength;
            
        }
      
        public int getNumSides() {
            return 3;
        }
      
        public double getSideLength() {
            return sideLength;
        }

        public static void main(String[] args) {
            
        }
      
    }
      
class Square implements RegularPolygon {
         double sideLength;
      
        public Square(double sideLength) {
            this.sideLength=sideLength;
        }
      
        public int getNumSides() {
            return 4;
        }
      
        public double getSideLength() {
            return sideLength;
        }
        public static void main(String[] args) {

            Square s1=new Square(5);
           System.out.println( s1.getPerimeter());
            System.out.println(s1.getInteriorAngel());
            
        }
      
        
      }
      
       

