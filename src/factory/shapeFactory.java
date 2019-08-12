package factory;

public class shapeFactory {

    public shape getShapeInstance(String shape) {

        if (shape.equals("CIRCLE")) {
            return new Circle();
        } else if (shape.equals("RECTANGLE")) {
            return new Rectangle();
        }
        return null;

    }
}
