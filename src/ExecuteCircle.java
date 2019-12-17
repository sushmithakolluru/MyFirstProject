
public class ExecuteCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Circle firstCircle  = new Circle();
		
		firstCircle.radius=10 ;
		
		System.out.println(firstCircle.getRadius());
		
		System.out.println(firstCircle.Perimeter() + "cm");
		
		System.out.println(firstCircle.Area() + "cm^2");
		
		Circle secondCircle = new Circle(7);
		
		System.out.println(secondCircle.getRadius() + "cm");
		System.out.println(secondCircle.Perimeter() + "cm");
		System.out.println(secondCircle.Area() + "SqCm");
		String x= firstCircle.getRadius();
		String y= secondCircle.getRadius();
		String z = x+y;
		System.out.println("sm of the radiuses of the circles is : "+z);
		
		double a = firstCircle.Area();
		double b = secondCircle.Area();
		double c = a*b;
		System.out.println("product of the areas of the circles is : "+c);
		
		if (firstCircle.Perimeter()%5==0) {
			
			System.out.println("Fizz");
			
		}
			
			if (firstCircle.Perimeter()>0 && secondCircle.Perimeter()>0)
				
				System.out.println("Buzz");
		
		
		
			
			
		
	}

}
