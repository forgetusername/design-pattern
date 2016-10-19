package design;

import java.util.Map;

public class Room implements MapSite {

	private int roomNo;
	private Map<Direction, MapSite> sides;
	
	public Room(int roomNo) {
		this.roomNo = roomNo;
	}
	
	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub
		
	}
	
	public MapSite getSide(Direction derection) {
		return sides.get(derection);
	}
	
	public void setSide(Direction derection, MapSite site) {
		sides.put(derection, site);
	}

}
