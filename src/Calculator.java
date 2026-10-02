public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public long add(long a, long b) {
        return a + b;
    }

    // SUB
    public int sub(int a, int b) {
        return a - b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public long sub(long a, long b) {
        return a - b;
    }

    //  MULTIPLY
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    //  DIV
    public int div(int a, int b) {
        return a / b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public long div(long a, long b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("add: " + calc.add(10, 5));
        System.out.println("sub: " + calc.sub(10, 5));
        System.out.println("multiply: " + calc.multiply(10, 5));
        System.out.println("div: " + calc.div(10, 5));


    }
}
