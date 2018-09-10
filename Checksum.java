import java.util.Scanner;
public class Checksum
{
	public static void main (String args [])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your credit card number");
		System.out.println("Make sure it is 16 digits");


		long num1=scan.nextLong();
		int count=0;
		long num2=num1;
		long digit=0;
		long sum=0;
		while(num2!=0)
		{
			num2=num2/10;
			count++;
		}
		if(count!=16)
		{
			System.out.println("You entered "+count+" digits not 16");
			System.exit(0);
		}
		count=1;
		while(num1!=0)
		{
			digit=num1%10;
			num1=num1/10;
			if(count%2==0)
			{
				if(digit*2<10)
				{
					sum=sum+(digit*2);
				}
				else
				{
					digit=(digit*2)-9;
					sum=sum+digit;
				}
			}
			else
			{
				sum=sum+digit;
			}
			count++;
		}
		if(sum%10==0)
		{
			System.out.println("Card is Valid");
		}
		else
		{
			System.out.println("Card is inValid");
		}
	}
}