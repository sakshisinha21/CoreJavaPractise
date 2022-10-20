import java.util.Scanner;
class BloodDonation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int age;
		char gender;
		float weight;
		System.out.println("Enter Age: ");
		age=sc.nextInt();
		
		if(age>17)
		{
			System.out.println("Enter Gender(m/f)");
			gender=sc.next().charAt(0);
			System.out.println("Enter Weight: ");
			weight=sc.nextFloat();
			
			if(((gender=='m')&&(weight>=60))||((gender=='f')&&(weight>=50)))
				System.out.println("You can donate the blood!!!");
			else
					System.out.println("You can't donate the blood!!!");
			
		}
		else
				System.out.println("Your are underage to donate the blood. So please wait!!!");
			
			
	}
}