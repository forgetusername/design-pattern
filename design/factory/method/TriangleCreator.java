package design.factory.method;


public class TriangleCreator implements Creator {

	@Override
	public Shape makeShape() {
		return new Triangle();
	}

}
