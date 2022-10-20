import java.util.Scanner;
class StudentResult
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		float paper1,paper2,paper3;
		float AvgPer;
		
		System.out.println("Enter Marks of 1st paper");
		paper1=sc.nextInt();
		System.out.println("Enter Marks of 2nd paper");
		paper2=sc.nextInt();
		System.out.println("Enter Marks of 3rd paper");
		paper3=sc.nextInt();
		
		AvgPer=((paper1+paper2+paper3)/300)*100;
		if(AvgPer>=40)
			System.out.println("Congratulations you've passed.");
		else
			System.out.println("Sorry you've failed.");
		System.out.println("Total Percentage: "+AvgPer);
		
	}
}