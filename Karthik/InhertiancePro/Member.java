package Karthik.InhertiancePro;

public class Member {
    String Name;
    int Age;
    long Ph_No;
    String Address;
    double Salary;
    
    public void printsalary(){
        System.out.println(Salary);
    }
    public static void main(String[] args) {
        Employee emp=new Employee("Karthik", 23, 217-218-0074, "charleston", 100000);

        Manager man=new Manager("Avanthi", 23, 469-6579189, "charleston", 1000000);

        emp.printsalary();
        man.printsalary();
        
        System.out.println(emp.Name+" "+emp.Age+" "+emp.Address+" "+emp.Ph_No+" "+emp.Salary);
    }   


    
}
class Employee extends Member{

    String specialization;
    
    Employee(String name,int age, long ph_No,String address,double salary){
        this.Name=name;
        this.Age=age;
        this.Ph_No=ph_No;
        this.Address=address;
        this.Salary=salary;

    }

}
 class Manager extends Member{
    String department;

    Manager(String name,int age, long ph_No,String address,double salary){
        this.Name=name;
        this.Age=age;
        this.Ph_No=ph_No;
        this.Address=address;
        this.Salary=salary;

    }

 }

