package pakage4;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		System.out.println("Enter 5 values one by one :");
		int[] values  = new int[5];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i< values.length ; i++)
		{
			values[i]=sc.nextInt();
			sum=sum+values[i];
		}
		
		System.out.println("Enterd numbers are :");

		for(int i =0 ; i<values.length ; i++)
		{
			System.out.print(values[i]+"\t");
		}
		System.out.println();
		
		System.out.println("The sum of all enterd values is : "+sum);
		
		
	

	}

}
