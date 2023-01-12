package Workout;

public class Car extends Vehicle{

	static String color="Black";
	static int number=12345;
	public void display()
	{
	 System.out.println("Model:"+model+" Color:"+color+" Number:"+number);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.display();
		
	}

}
