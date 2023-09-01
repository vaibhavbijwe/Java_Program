import java.util.Scanner;
public class a2 {
	public static void main(String a[])
	{
		int year;
		System.out.println("Enter the year to check its leap or not leap year : ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		if(year % 400 == 0)
		{
			System.out.println(year+" is a Leap Year");
		}
		else if(year % 100 == 0)			
		{
			System.out.println(year+" is the Not Leap Year");
		}
		else if(year % 4 == 0)
		{
			System.out.println(year+" is a leap Year");
		}
		else
		{
			System.out.println(year+" is not a leap year");
		}
		}

}
