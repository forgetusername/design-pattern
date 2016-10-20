package design;

import static design.Direction.*;
import design.abstruct.factory.MazeFactory;
import design.builder.MazeBuilder;

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

		room1.setSide(North, new Wall());
		room1.setSide(East, door);
		room1.setSide(South, new Wall());
		room1.setSide(West, new Wall());

		room2.setSide(North, new Wall());
		room2.setSide(East, new Wall());
		room2.setSide(South, new Wall());
		room2.setSide(West, door);

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
		
		room1.setSide(North, factory.makeWall());
		room1.setSide(East, door);
		room1.setSide(South, factory.makeWall());
		room1.setSide(West, factory.makeWall());

		room2.setSide(North, factory.makeWall());
		room2.setSide(East, factory.makeWall());
		room2.setSide(South, factory.makeWall());
		room2.setSide(West, door);
		
		return maze;
	}
	
	/**
	 * 生成器方式
	 * 隐藏迷宫的内部表示——即定义房间、门和墙的那些类——以及这些部件是如何组装最终的迷宫的
	 */
	public Maze createMaze(MazeBuilder builder) {
		builder.buildMaze();
		
		builder.buildRoom(1);
		builder.buildRoom(2);
		builder.buildDoor(1, 2, West);
		
		return builder.getMaze();
	}
}
