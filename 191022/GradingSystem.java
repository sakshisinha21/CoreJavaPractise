import java.util.Scanner;

class GradingSystem
{
	
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		
		float percentage;
		char grade;
		
		System.out.println("Enter the percentage:");
		percentage= sc.nextFloat();
	
		if(percentage>=85)
	     	 grade='A';
		 else if(percentage>=70)
			  grade='B';
		      else if(percentage>=55)
				   grade='C';
	               else if(percentage>=40)
                        grade='D';
                        else
                            grade='F';

        if(grade=='F')
	      System.out.println("Sorry!! You have failed... Work hard next time");
	   else
            System.out.println("You have cleared the exam with grade:"+grade);		   
		    
	}
		
}