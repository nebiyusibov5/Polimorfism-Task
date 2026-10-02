public abstract class Shape {
    public void perimetr(){

    }
public static void main(String[] args){
        Shape A= new Rectangle(5,10);
        Shape B= new Triangle(3,4,5);

        Shape[] arr={A,B};

       for (Shape C:arr){
           C.perimetr();
       }

}
}
