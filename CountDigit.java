package Test1;

public class Countdigit {

	public static void main(String[] args) {
		int count=0;
		int num=37921;
		
		while (num!=0)
		{
			// num=num/10
			num/=10;
			count++;
		}
		System.out.println("Number of digits: "+ count);

	}
}