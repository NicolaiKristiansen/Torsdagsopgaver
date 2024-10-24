package Task4;

public class Square implements Shape{
    double length;

    Square(double length){
        this.length = length;
    }
    @Override
    public double getArea(){
        double area = length * length;
        return area;
    }
}
