package Task4;

import java.util.ArrayList;

public class ShapeBuilder {
    ArrayList<Shape> shapes = new ArrayList<>();
    double areaSum = 0;

    public void addShape(Shape s){
        shapes.add(s);
    }

    public double getTotalArea(){
    for(Shape s: shapes){
        areaSum = areaSum + s.getArea();
    }
    return areaSum;
    }
}
