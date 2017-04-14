import ColorPackage.*;
import ShapePackage.*;


public class ShapeFactory extends AbstractFactory{

	@Override
	Shape getShape(String shape) {
		if(shape.equalsIgnoreCase("Triangle")){
			return new Triangle();
		}else if(shape.equalsIgnoreCase("Retangle")){
			return new Retangle();
		}else if(shape.equalsIgnoreCase("Circle")){
			return new Circle();
		}
		return null;
	}

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
