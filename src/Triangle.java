public class Triangle extends Shape{
    public int a;
    public int b;
    public int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void perimetr() {
        int result=a+b+c;
        System.out.println(result);
    }
}
