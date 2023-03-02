package Karthik.AssignAbstract;

abstract public class MarksAbs {
    
    abstract double getPercentage();
    
}
class ClassesA extends MarksAbs{
   double a;
   double b;
   double c;
   double d;
   double per=0;

    @Override
    double getPercentage() {
        per=(a+b+c+d)/400*100;

        
    
        return per;
    }

    ClassesA(double math,int phy,int che,int soc){
        this.a=math;
        this.b=phy;
        this.c=che;
        this.d=soc;



    }

}
class ClassesB extends MarksAbs{


    double a,b,c;
  //  int b;
    //int c;
    double percentage=0.00;

    @Override
    double getPercentage() {
        System.out.println("hi"+a+" "+b+" "+c);
        percentage=(a+b+c)/300*100;
        System.out.println(percentage);
        
        return percentage;
    }

    ClassesB(int math,int phy,int che ){
        this.a=math;
        this.b=phy;
        this.c=che;
    }

    public static void main(String[] args) {
        ClassesA objA=new ClassesA(55,87 , 89, 90);
        ClassesB objB=new ClassesB(33, 78, 44);

       double k=objA.getPercentage();
        System.out.println("The marks obtained by Student A is  "+k);

        double l=objB.getPercentage();
        System.out.println("The marks obtained by Student B is "+l);
        

    }

}
