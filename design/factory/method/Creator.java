package design.factory.method;


public interface Creator {

	/**
	 * 工厂方法
	 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。
	 */
	Shape makeShape();
	
}
