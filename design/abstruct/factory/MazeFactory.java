package design.abstruct.factory;

import design.Door;
import design.Maze;
import design.Room;
import design.Wall;

public interface MazeFactory {

	/**
	 * 创建迷宫
	 * @return
	 */
	Maze makeMaze();
	
	/**
	 * 创建墙
	 * @return
	 */
	Wall makeWall();
	
	/**
	 * 创建房间
	 * @param roomNo
	 * @return
	 */
	Room makeRoom(int roomNo);
	
	/**
	 * 创建门
	 * @param room1
	 * @param room2
	 * @return
	 */
	Door makeDoor(Room room1, Room room2);
}
