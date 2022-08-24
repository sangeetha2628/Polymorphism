import java.util.*;
class Car
{
	void run()
	{
		System.out.println("Audi");
	}
}
class Bike extends Car
{
	void run()
	{
		System.out.println("KTM");
	}
}
class Poly
{
	public static void main(String args[])
	{
		Car c=new Bike();
		
		c.run();
		c=new Car();
		c.run();
	}
}