
/**
 * 
 * @author Aaron Ortiz
 *
 */

public class Room {
	private String color;
	private String floor;
	private int windows;
	
	public Room() { 
		this.color = "Gold ";
		this.floor = "none ";
		this.windows = 0; 
		
	}
	
	public Room(String color, String floor, int windows) {
		this.color = color;
		this.floor = floor;
		this.windows = windows; 
	}
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFloor() {
		return this.floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public int getWindows() {
		return this.windows;
	}
	public void setWindows(int windows) { 
		this.windows = windows;
	}
	public String toString() {
		return "The room is this color..." + this.color + "has " + this.floor + "type of floor and this " + this.windows + 
				" amount of windows";
	

	

	}

}

