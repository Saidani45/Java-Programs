package Test1;
import java.util.Scanner;
public class Account {

	public static void main(String[] args) {
		int p=2363,pin;
		int count=0;
	Scanner sc=new Scanner(System.in);
	 for(int i=0; i<3; i++)
	 {
	 System.out.println("Enter your pin");
	 pin=sc.nextInt();
	 
	 if(p==pin)
	 {
		 System.out.println("Correct, Welcome back");
		 break;
	 }
	 else
	 {
		 count++;
		 if(count==3)
		 {
	       System.out.println("Sorry but you have been locked out Incorrect, try again");
	       break;
		 }
		 
	{
		System.out.println("Incorrect, try again");
	}
  }
 }
}
}