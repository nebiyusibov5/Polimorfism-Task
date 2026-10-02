public class ProductManager extends  Employee {
    public double bonus;

    public ProductManager(int id, String name, int netSalary, int bonus) {
        super(id, name, netSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalaray() {
        return netSalary+bonus;
    }
}
