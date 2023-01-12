package Workout;

public class LineItem {
	
	int qnty;
	
 public LineItem(int qnty)
 {
	 this.qnty=qnty;
 }
 void show()
 {
	 System.out.println("Quantity:"+qnty);
	 //System.out.println("id:"+pro.id+"name:"+pro.name+"Description:"+pro.Description);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pro=new Product(101,"tv","Sony television");
		LineItem LI=new LineItem(50);
		LI.show();
	}

}
