package factory;

public class FactoryTest {

    public static void main(String[] args) {

        shapeFactory shapeFactory = new shapeFactory();

        shape circle=shapeFactory.getShapeInstance("CIRCLE");

        circle.draw();

        shape rectangle = shapeFactory.getShapeInstance("RECTANGLE");

        rectangle.draw();



    }
}
