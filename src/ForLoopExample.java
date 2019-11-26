
public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanBeing d=new HumanBeing();
		d.name="Dhanvi";
		d.age=0.5;
		d.friends=new String[]{"Abhinav", "Adwik"};
		d.see();
		
		System.out.println(d.friends[0]);
		System.out.println(d.age + 2);
		
		if (d.friends.length>0)
		{
			for (int i=0;i<d.friends.length;i++)
			{
				System.out.println(d.friends[i]);
			}
	}

}
}
