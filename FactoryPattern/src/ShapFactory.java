
import products.*;

public class ShapFactory {
	
	private Shape Circle;

	public Shape getShape(String shapeType){
		
		if(shapeType == null){
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("circle")){
			
			return new Circle();
			
		}else if(shapeType.equalsIgnoreCase("square")){
			
			return new Square();
	
		}else if(shapeType.equalsIgnoreCase("Retangle")){
		
			return new Retangle();
		}
		
		return null;
		
	}
}
