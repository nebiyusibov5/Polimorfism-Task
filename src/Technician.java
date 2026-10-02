public class Technician extends Employee {
    public Technician(int id, String name, int netSalary) {
        super(id, name, netSalary);
    }

    @Override
    public double calculateSalaray() {
        return netSalary/2;
    }
}