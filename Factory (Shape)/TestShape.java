public class TestShape {
	public static void main(String args[]){
		Shape shape;
		ShapeFactory factory;

		factory = new ShapeFactory();
		shape = factory.createShape(args[0]);

		shape.draw();
		shape.area();
		shape.perimeter();
	}
}