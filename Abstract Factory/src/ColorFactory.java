import ColorPackage.*;
import ShapePackage.*;


public class ColorFactory extends AbstractFactory{
	
	@Override
	public Color getColor(String color) {
		if(color.equalsIgnoreCase("Red")){
			return new Red();
		}else if(color.equalsIgnoreCase("Blue")){
			return new Blue();
		}else if(color.equalsIgnoreCase("Green")){
			return new Green();
		}
		return null;
	}
	
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
