public class ExecuteHumanBeing{
	public static void main (String[] a) {
		//a[0]="Java";
		//System.out.println(("Hello World "+a[0]));
		
		HumanBeing b=new HumanBeing();
		b.name="sushmitha";
		b.age=27;
		b.see();
		b.tellMeYourAge();
		b.friends= new String[]{"Nag","Suj"};
		
		System.out.println(b.name + " " + b.age);
		//System.out.println(b.friends[0]);
		
		HumanBeing c=new HumanBeing();
		c.name="Pattabhi";
		c.age=31;
		c.see();
		c.tellMeYourAge();
		c.friends=new String[] {"Varun","Hutchy","Uday"};
		//for(int i=0; i<c.friends.length;i++) {
			System.out.println("name is : " + c.getName() );
			
			
			
		String object = new String();
		object = c.getName();
		System.out.println(object);
		
		Man Abhishek = new Man();
		Abhishek.name= "KNS";
		Abhishek.see();
		Abhishek.shave();
		
		Woman Meenaakshi = new Woman();
		Meenaakshi.name= "Meenu";
		Meenaakshi.see();
		
		HumanBeing Selenium = new Man();
		Selenium.see();
		Selenium.drive();
		
	}
}
