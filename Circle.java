package lab11;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        double area = (3.14) * (radius * radius);
        return area;
    }
}