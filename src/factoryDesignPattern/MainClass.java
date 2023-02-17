package factoryDesignPattern;

import factoryDesignPattern.shapes.Shape;
import factoryDesignPattern.shapeFactory.ShapeFactory;

public class MainClass {
    public static void main(String[] args) {
        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shapeObj = shapeFactoryObj.getShape("CIRLE");
        shapeObj.draw();
    }
}
