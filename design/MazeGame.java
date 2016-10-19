package design;

import design.abstruct.factory.MazeFactory;

public class MazeGame {

	/**
	 * 普通方式创建迷宫
	 */
	public Maze createMaze() {
		Maze maze = new Maze();
		Room room1 = new Room(1);
		Room room2 = new Room(2);
		Door door = new Door(room1, room2);

		maze.addRoom(room1);
		maze.addRoom(room2);

		room1.setSide(Direction.North, new Wall());
		room1.setSide(Direction.East, door);
		room1.setSide(Direction.South, new Wall());
		room1.setSide(Direction.West, new Wall());

		room2.setSide(Direction.North, new Wall());
		room2.setSide(Direction.East, new Wall());
		room2.setSide(Direction.South, new Wall());
		room2.setSide(Direction.West, door);

		return maze;
	}
	
	/**
	 * 抽象工厂方式创建迷宫
	 */
	public Maze createMaze(MazeFactory factory) {
		Maze maze = factory.makeMaze();
		Room room1 = factory.makeRoom(1);
		Room room2 = factory.makeRoom(2);
		Door door = factory.makeDoor(room1, room2);
		
		maze.addRoom(room1);
		maze.addRoom(room2);
		
		room1.setSide(Direction.North, factory.makeWall());
		room1.setSide(Direction.East, door);
		room1.setSide(Direction.South, factory.makeWall());
		room1.setSide(Direction.West, factory.makeWall());

		room2.setSide(Direction.North, factory.makeWall());
		room2.setSide(Direction.East, factory.makeWall());
		room2.setSide(Direction.South, factory.makeWall());
		room2.setSide(Direction.West, door);
		
		return maze;
	}
}
