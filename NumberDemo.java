package Workout;
import java.util.*;
public class NumberDemo {
	
	
 public  int cal(int n)
 {
	 int no=n;
	 int digit;
	 int sum=0;
	 while(no > 0)  
		{  
		  
		digit = no % 10;  
		
		sum = sum + digit;  
		
		no= no / 10;  
		}  
		return sum;
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no, digit, sum = 0;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		no = sc.nextInt(); 
		NumberDemo nd=new NumberDemo();
		System.out.println("Sum of Digits: "+nd.cal(no));  
		}  
		}  
	
