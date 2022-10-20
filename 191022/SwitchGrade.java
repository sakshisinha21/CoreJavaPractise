import java.util.Scanner;
class SwitchGrade
{

	static void printRemarks(char gr)
	{	
	
	   switch(gr)
	   {
	   
		   case 'A':System.out.println("Excellent Performance...");
		          break;
		   case 'B':System.out.println("Very Good...");
		          break;
		   case 'C':System.out.println("Good...Can do better");
		          break;
		   case 'D':System.out.println("Fair.. Need to work very hard");
		          break;
		   case 'F':System.out.println("Fail... Better luck next time");
		          break;
		  default: System.out.println("Wrong Input");
				  
				  
	   }
	
	}
	
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		
		char grade;
		System.out.println("Enter the grade:");
		grade= sc.next().charAt(0);
		
		printRemarks(grade);	
		    
	}
	
}
	   