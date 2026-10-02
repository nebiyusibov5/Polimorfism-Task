import java.util.concurrent.RecursiveTask;

public class Employee {
    public int id;
    public String  name;
    public int netSalary;

    public Employee(int id, String name, int netSalary) {
        this.id = id;
        this.name = name;
        this.netSalary = netSalary;
    }

    public double calculateSalaray(){
        return netSalary;
    }


    public static void main(String[] args){
        Employee obj=new ProductManager(10,"nabi",2000,200);
        Employee obj2=new Developer(11,"fuad",1500,300);
        Employee obj3=new Technician(12,"eli",2000);

        Employee[] arr={obj,obj2,obj3};

        for (Employee x:arr){
            System.out.println(x.calculateSalaray());
        }
    }

}
