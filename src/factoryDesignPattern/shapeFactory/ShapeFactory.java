package factoryDesignPattern.shapeFactory;

import factoryDesignPattern.shapes.Circle;
import factoryDesignPattern.shapes.Rectangle;
import factoryDesignPattern.shapes.Shape;
import factoryDesignPattern.shapes.Triangle;

public class ShapeFactory {
    public Shape getShape(String shape){
        return switch (shape) {
            case "RECTANGLE" -> new Rectangle();
            case "TRIANGLE" -> new Triangle();
            default -> new Circle();
        };
    }
}
