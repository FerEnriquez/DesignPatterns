public class ShapeFactory{
	public Shape createShape(String shapeType){
		Shape shape = null;
		if(shapeType.equals("0")){
			shape = new Circle();
		} else if (shapeType.equals("1")){
			shape = new Rectangle();
		} else if (shapeType.equals("2")){
			shape = new Square();
		}

		return shape;	
	}
}