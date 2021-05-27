package lab11;

public class Runner {
    public static void main(String[] args){
        Shape[] shapesArray = new Shape[3];
        Rectangle R1 = new Rectangle(2,6);
        Circle C1 = new Circle(2.14);
        Triangle T1 = new Triangle(7,4);
        shapesArray[0] = R1;
        shapesArray[1] = C1;
        shapesArray[2] = T1;
        CalculateAreas.printAreaArray(CalculateAreas.calculateAreas(shapesArray));
    }
}