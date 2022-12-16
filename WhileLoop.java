package Test1;
import java.util.Scanner;
public class Whileloop {

	public static void main(String[] args) 
	{
		int firstNum; 
		int secondNum;
		int evenSum=0; 
		int oddSum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two positive numbers: ");
		firstNum=sc.nextInt();
		secondNum=sc.nextInt();
		
		if(firstNum < secondNum)
		{
			System.out.println("Even numbers are: ");
			for(int i=firstNum; i<=secondNum; i++)
			{
				if(i%2==0)
				{
					System.out.println(i+",");
					
					evenSum=evenSum + i;
				}
			}
			
		System.out.println("\n\n Sum of even numbers from "+firstNum+" to "+secondNum+" is: "+evenSum+"\n\n");
		System.out.println("Odd numbers are: ");
		for(int i=firstNum; i<=secondNum; i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+",");
				oddSum=oddSum+i;
			}
		}
		System.out.println("\n\n Sum of odd numbers from "+firstNum+" to "+secondNum+" is: "+oddSum+"\n\n");
		}
	else
		System.out.println("Invalid Input");
}
}