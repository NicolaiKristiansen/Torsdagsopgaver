package Task4;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(5);

        System.out.println(circle.getArea());
        System.out.println(square.getArea());

        ShapeBuilder shapeBuilder = new ShapeBuilder();

        shapeBuilder.addShape(circle);
        shapeBuilder.addShape(square);

        System.out.println(shapeBuilder.getTotalArea());
    }
}
