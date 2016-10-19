package design.abstruct.factory;

import design.Door;
import design.Maze;
import design.Room;
import design.Wall;

public class DefaultMazeFactory implements MazeFactory {

	@Override
	public Maze makeMaze() {
		return new Maze();
	}
	
	@Override
	public Wall makeWall() {
		return new Wall();
	}
	
	@Override
	public Room makeRoom(int roomNo) {
		return new Room(roomNo);
	}
	
	@Override
	public Door makeDoor(Room room1, Room room2) {
		return new Door(room1, room2);
	}
}
