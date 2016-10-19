package design;

public class Door implements MapSite {
	
	private Room room1, room2;
	private boolean isOpen;

	public Door(Room room1, Room room2) {
		this.room1 = room1;
		this.room2 = room2;
	}
	
	@Override
	public void enter() {
		// TODO Auto-generated method stub
		
	}
	
	public Room otherSideFrom(Room room) {
		// TODO Auto-generated method stub
		return null;
	}

}
