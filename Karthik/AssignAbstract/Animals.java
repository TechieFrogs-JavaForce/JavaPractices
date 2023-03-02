package Karthik.AssignAbstract;

public abstract  class Animals {

    abstract void cats();

    abstract void dogs();


    
}

class Cats extends Animals {

    void cats(){
        System.out.println("Cats meow");
    }

    @Override
    void dogs() {
        // TODO Auto-generated method stub
        
    }
}
class Dogs extends Animals {

    void dogs(){
        System.out.println("Dogs bark");

    }

    @Override
    void cats() {
        // TODO Auto-generated method stub
        
    }
    public static void main(String[] args) {
        
        Dogs objD1=new Dogs();
        objD1.dogs();

        Cats objC1=new Cats();
        objC1.cats();
    }
}
