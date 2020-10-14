package pakage4;



import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of values you have to enter : ");
		int len = sc.nextInt();
		
		int[] values = new int[len];
		System.out.println("enter values one by one");
		for(int i =0 ; i<values.length ; i++)
		{
			values[i]=sc.nextInt();
		}

		System.out.println("Enterd numbers are :");

		for(int i =0 ; i<values.length ; i++)
		{
			System.out.print(values[i]+"\t");
		}
		System.out.println();
	    
		System.out.println("Enterd Odd numbers5 are :");
		for(int i =0 ; i<values.length ; i++)
		{
			if(values[i]%2!=0) 
			{
				System.out.print(values[i]+"\t");
			}
			
		}
		


		

	}

}
