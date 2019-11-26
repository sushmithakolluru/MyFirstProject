
public class WhileDoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanBeing d = new HumanBeing();
		d.name = "Dhanvi";
		d.age = 0.5;
		d.friends = new String[] { "Abhinav", "Adwik" };
		// d.see();

		// System.out.println(d.friends[2]);
		// System.out.println(d.age + 2);

		int j = 0;

		while (j < d.friends.length) {
			System.out.println(d.friends[j]);

			j = 100;
		}
		
		int l = 10;

		while (l < d.friends.length) {
			System.out.println(d.friends[l]);

			j = 100;
		}

		int k = 10;
		do {
			System.out.println("Printing in Do while loop");
		} while (k < d.friends.length);

	}
}
