package Task4;

public class Circle implements Shape{
    double radius;
    double pi = 3.14;

    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        double area = pi * (radius * radius);
        return area;
    }
}
