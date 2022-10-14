import java.util.Scanner;
class AverageThreeScanner
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number1,number2,number3;
		System.out.println("Enter 1st No:");
		number1=sc.nextInt();
		System.out.println("Enter 2nd No:");
		number2=sc.nextInt();
		System.out.println("Enter 3rd No:");
		number3=sc.nextInt();
		System.out.println("Average: "+(number1+number2+number3)/3f);
	}
}