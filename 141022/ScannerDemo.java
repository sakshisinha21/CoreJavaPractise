import java.util.Scanner;


class ScannerDemo
{
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your name:");
		String name= sc.next(); 
		
		
		System.out.println("Enter your age:");
		int age = sc.nextInt(); 
		
		
		
		System.out.println("Enter your marks:");
		float marks = sc.nextFloat(); 
		
		System.out.println("Enter your pass(true/false):");
		boolean pass = sc.nextBoolean(); 
		
		
		System.out.println("Enter your gender(M/F):");
		char gender = sc.next().charAt(0); 
		
		
		System.out.println("------------------");
		System.out.println("Your details are:");
		System.out.println("Name:"+ name);
		System.out.println("Gender:"+ gender);
		System.out.println("Age:"+ age);
		System.out.println("Marks:"+ marks);
		System.out.println("Pass:"+ pass);
				
	}
	
}