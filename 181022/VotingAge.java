import java.util.Scanner;
class VotingAge
{
	public static void main(String args[])
	{
		int age;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an age of a person: ");
		age=s.nextInt();
		if(age>=18)
			System.out.println("Eligible for voting");
		else
			System.out.println("Not Eligiable for voting");
	}
}	