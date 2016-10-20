package design.builder;

import design.Direction;
import design.Maze;

/**
 * 构建器接口
 */
public interface MazeBuilder {

	void buildMaze();
	
	void buildRoom(int roomNo);
	
	/**
	 * 构建门
	 * @param roomFrom
	 * @param roomTo
	 * @param from roomTo 相对于 roomFrom 的方向
	 */
	void buildDoor(int roomFrom, int roomTo, Direction from);
	
	Maze getMaze();
}
