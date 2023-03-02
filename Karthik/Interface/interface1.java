package Karthik.Interface;


    
interface Interface1 {
     void method1();
    void method2();
}

interface Interface2 {
    public void method3();
    public void method4();
}

interface Interface3 {
    public void method5();
    public void method6();
}

interface NewInterface extends Interface1, Interface2, Interface3 {
    public void method7();
}

class ConcreteClass {
    public void concreteMethod1() {
        System.out.println("Concrete Method 1");
    }

    public void concreteMethod2() {
        System.out.println("Concrete Method 2");
    }
}

class ClassImplementingNewInterface extends ConcreteClass implements NewInterface  {
    public void method1() {            //highestpriority for interface
        System.out.println("Method 1");
    }

    public void method2() {
        System.out.println("Method 2");
    }

    public void method3() {
        System.out.println("Method 3");
    }

    public void method4() {
        System.out.println("Method 4");
    }

    public void method5() {
        System.out.println("Method 5");
    }

    public void method6() {
        System.out.println("Method 6");
    }

    public void method7() {
        System.out.println("Method 7");
    }
}

 class Main {
    public static void method1(Interface1 i1) {
        i1.method1();
        i1.method2();
    }

    public static void method2(Interface2 i2) {
        i2.method3();
        i2.method4();
    }

    public static void method3(Interface3 i3) {
        i3.method5();
        i3.method6();
    }

    public static void method4(NewInterface ni) {
      
    }

    public static void main(String[] args) {
        ClassImplementingNewInterface obj = new ClassImplementingNewInterface();

        method1(obj);
        method2(obj);
        method3(obj);
        method4(obj);
    }
}

