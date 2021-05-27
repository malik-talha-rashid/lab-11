package lab11;

public class Triangle implements Shape{
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double area(){
        double area = (base * height) / (2);
        return area;
    }
}