package design.builder;

import design.Direction;
import design.Door;
import design.Maze;
import design.Room;
import design.Wall;

public class StandardMazeBuilder implements MazeBuilder {

	private Maze currentMaze;
	
	@Override
	public void buildMaze() {
		currentMaze = new Maze();
	}

	@Override
	public void buildRoom(int roomNo) {
		// 创建房间并初始化周围的墙
		if (currentMaze.getRoom(roomNo) != null) {
			Room room = new Room(roomNo);
			currentMaze.addRoom(room);
			
			room.setSide(Direction.North, new Wall());
			room.setSide(Direction.South, new Wall());
			room.setSide(Direction.East, new Wall());
			room.setSide(Direction.West, new Wall());
		}
		
	}

	@Override
	public void buildDoor(int roomFrom, int roomTo, Direction from) {
		// 建造两个房间之间的门
		Room room1 = currentMaze.getRoom(roomFrom);
		Room room2 = currentMaze.getRoom(roomTo);
		Door door = new Door(room1, room2);
		
		room1.setSide(from, door);
		room1.setSide(from.opposite(), door);
	}

	@Override
	public Maze getMaze() {
		return currentMaze;
	}

}
