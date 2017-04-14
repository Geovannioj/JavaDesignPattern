import ShapePackage.Shape;
import ColorPackage.Color;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args){
		
		//instanciation of the factories
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
		AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
		
		//instanciation of Shapes
		Shape circle = shapeFactory.getShape("Circle");
		circle.draw();
		
		Shape triangle = shapeFactory.getShape("Triangle");
		triangle.draw();
		
		Shape retangle = shapeFactory.getShape("Retangle");
		retangle.draw();
		
		//instanciate of Colors
		
		Color red = colorFactory.getColor("Red");
		red.fill();
		
		Color blue = colorFactory.getColor("Blue");
		blue.fill();
		
		Color green = colorFactory.getColor("Green");
		green.fill();
	}
}
