import products.*;

public class FactoryPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapFactory shape = new ShapFactory();
		
		Shape shape1 = shape.getShape("circle");
		shape1.draw();
		
		Shape shape2 = shape.getShape("retangle");
		shape2.draw();
		
		Shape shape3  = shape.getShape("Square");
		shape3.draw();
		

	}

}
