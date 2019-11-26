
public class HumanBeing {

	public String name;
	public double age;
	public String[] friends ;
	private int BSN; //This will not be inherited in the base class
		
	
	
	public void see() {
		System.out.println(name + " is seeing");
	}
	
	public void tellMeYourAge() {
		System.out.println("my age is"+ age);
	}
	
	public void drive() {
		System.out.println("Humans drive");
	}
	
	

}
