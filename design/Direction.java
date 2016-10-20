package design;

public enum Direction {

	North, South, East, West;
	
	/**
	 * 获取相反的位置
	 */
	public Direction opposite() {
		switch (this) {
			case North:
				return South;
			case South:
				return North;
			case East:
				return West;
			case West:
				return East;
			default:
				throw new RuntimeException("unkown direction!");
			}
	}
}
