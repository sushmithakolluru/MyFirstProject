
public class ExecuteSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square firstSquare = new Square(7);

		System.out.println(firstSquare.getSide());

		System.out.println(firstSquare.perimeter());

		System.out.println(firstSquare.Area());

		if (firstSquare.perimeter() % 5 == 0) {

			System.out.println("Evadra Pattabhi");

		}

		else {
			System.out.println("You: Pattabhi ChapterLead- ING Me: Aithey Enti bey");
		}

		if (firstSquare.Area() > 10) {

			System.out.println("I will get a job");
		}

		Square SecondSquare = new Square(9);

		System.out.println(SecondSquare.getSide());

		System.out.println(SecondSquare.perimeter() + "cm");

		System.out.println(SecondSquare.Area() + "SqCm");

		System.out.println(firstSquare.getSide() + SecondSquare.getSide());

		System.out.println(firstSquare.Area() * SecondSquare.Area());

		if (SecondSquare.Area() != 7) {

			System.out.println("Minne is zeven maanden oud");
		}

		else {

			System.out.println("Minnie is een Meisje");
		}

		if (firstSquare.perimeter() > 0 && SecondSquare.perimeter() > 0) {

			System.out.println("Minnie is Mooi");
		}

		else {

			System.out.println("Minnie is goede");
		}
	}

}
