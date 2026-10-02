public class Rectangle extends Shape {
    public int width;
    public int heigth;

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public void perimetr() {
        int result=(width+heigth)*2;
        System.out.println(result);
    }
}
