package design.factory.method;


public class RectangleCreator implements Creator {

	@Override
	public Shape makeShape() {
		return new Rectangle();
	}

}
