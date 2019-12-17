
public class Square {
	
	int side;
	
	public int Area() {
		
		return side*side;
	}
	
	public int perimeter() {
		
		return 4*side;
	}
	
	public Square(int side) {
		this.side= side;
	}
	
	public int getSide() {
		return this.side;
	}

}
