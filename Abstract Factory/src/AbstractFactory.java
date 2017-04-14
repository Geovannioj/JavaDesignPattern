import ShapePackage.*;
import ColorPackage.*;

public abstract class AbstractFactory {
	
	abstract Shape getShape(String shape);
	abstract Color getColor(String color);
	
}
