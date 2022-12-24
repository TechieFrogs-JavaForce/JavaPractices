public class Hello {
    int x = 5; // instance 
    public static int y = 20; //static

    public static void main(String[] args){
         int a = 5;
         long l =196883686856835579l;
         byte b =5;
         char d='k';
        String s="Hi";
        float f=42.66f;
        double h=12e4;

        Hello hObj = new Hello();
        hObj.x = 25;
        hObj.x = 50;
        y = 40;
        System.out.println("Y value is "+Hello.y);

        Hello hObj1 = new Hello();
        hObj1.x = 15;
        y = 60;

        System.out.println(hObj.x+"   "+hObj1.x);

        System.out.println("Y value is "+Hello.y);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(l);
        System.out.println(d);
        System.out.println(s);
        System.out.println(f);
        System.out.println(h);
    }

}
