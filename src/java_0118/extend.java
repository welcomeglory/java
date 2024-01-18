package java_0118;
class Shape {
}
class Circle extends Shape {
}
class Rectagle extends Shape {
}
public class extend {
	public static void main(String[] args) {
		//Shape shape = new Circle();
		Shape[] shapeArr = new Circle[5];
		shapeArr[0] = new Circle();
		shapeArr[1] = new Circle();
		shapeArr[2] = new Circle();
		shapeArr[3] = new Circle();
		shapeArr[4] = new Circle();
		for(Shape shape:shapeArr) {
			System.out.println(shape);
		}	
		Shape[] shapeArr2 = {new Circle(),new Shape()};
		for(Shape shape:shapeArr2) {
			System.out.println(shape+""+shapeArr2);
		}
	}
}
