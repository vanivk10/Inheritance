package Workout;

public class AbstractionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj=new Honda();//parent class name used here parent class is used for upcasting 
		Honda obj1=new Honda();//subclass name used
		obj.run();
		obj1.run();

	}

}
