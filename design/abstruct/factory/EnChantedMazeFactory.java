package design.abstruct.factory;

import design.Door;
import design.Maze;
import design.Room;
import design.Wall;

/**
 * 施了魔法的迷宫
 */
public class EnChantedMazeFactory implements MazeFactory {

	@Override
	public Maze makeMaze() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Wall makeWall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room makeRoom(int roomNo) {
		/*
		 * return new EnchantedRoom(roomNo);
		 */
		return null;
	}

	@Override
	public Door makeDoor(Room room1, Room room2) {
		// TODO Auto-generated method stub
		return null;
	}

}
