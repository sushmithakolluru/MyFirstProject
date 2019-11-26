
public class ExecuteHumanBeing2 {
	public static void main ( String[] a) {
		HumanBeing d=new HumanBeing();
		d.name="Dhanvi";
		d.age=0.5;
		d.friends=new String[]{"Abhinav", "Adwik"};
		//d.see();
		
		//System.out.println(d.friends[2]);
		//System.out.println(d.age + 2);
		
		if (d.friends.length>0)
		{
			for (int i=0;i<d.friends.length;i++)
			{
				System.out.println(d.friends[i]);
			}
			
			int j=10;
			
			while (j<d.friends.length) {
				System.out.println(d.friends[j]);
			
			j=10;
			
			int k=10;
			do {
			System.out.println("Printing in Do while loop");
			} while (k<d.friends.length);
			
			}
			
				
		
		}
		else
	
			System.out.println("There are 2");
	
	}
}
