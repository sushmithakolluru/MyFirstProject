
public class Circle {

	int radius;

	static double pie = 3.14;

	public double Perimeter() {

		return 2 * pie * this.radius;

	}

	public double Area() {

		return pie * this.radius * this.radius;
	}

	public Circle() {

	}

	public Circle(int radius) {

		this.radius = radius;

	}
	
	public String getRadius() {
		return this.radius + "cm";
	}

}
