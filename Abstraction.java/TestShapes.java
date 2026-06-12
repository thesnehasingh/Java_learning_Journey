package in.kgcoding.Abstraction;

public class TestShapes {
    public static void main(String[] args) {
        //Shape shape = new Shape();
        Square square = new Square(10.3);
        Circle circle = new Circle(5);

        System.out.printf("Area of Circle is %s and Area of Square is %s", circle.calculateArea(), square.calculateArea() );
    }
}
