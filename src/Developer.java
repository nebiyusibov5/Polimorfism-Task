public class Developer extends Employee{
  public double perHour;

    public Developer(int id, String name, int netSalary, double perHour) {
        super(id, name, netSalary);
        this.perHour = perHour;
    }

    @Override
    public double calculateSalaray() {
        return netSalary + perHour;
    }
}
