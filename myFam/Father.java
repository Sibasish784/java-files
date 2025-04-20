package myFam;

public class Father {

	private void atm()
	{
		System.out.println("Atm is Private only Father");
	}
	void car()
	{
		System.out.println("Car is Default only myFam"); 
	}
	protected void bike()
	{
		System.out.println("Bike is Protected only myFam");
	}
	public void home()
	{
		System.out.println("Home is Public");
	}
	public static void main(String[] args) 
	{
		Father f = new Father();
		f.atm();
		f.car();
		f.bike();
		f.home();
	}

}
