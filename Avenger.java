package pakage4;

import java.util.Scanner;

public class Avenger 
{
	String name;
	int age;
	String power;
	String weapon;
	String planet;
	
	Scanner sc = new Scanner(System.in);
	void getDetails()
	{
		System.out.print("Enter the Name  :  ");
		name = sc.nextLine();
		
		System.out.print("Enter the Age  :  ");
		age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter the Power  :  ");
		power= sc.nextLine();
		
		System.out.print("Enter the Weapon  :  ");
		weapon = sc.nextLine();
		
		System.out.print("Enter the Planet  :  ");
		planet = sc.nextLine();
		
		
	}
	
	void displayDetails()
	{
		
		System.out.println("=================================================="+"\nAvenger name is "  + name +". \nAge : "+age+" year old\nPower : "+power+"\nWeapon :"+weapon+"\nPlanet :"+planet+"\n==================================================");
		
	}

}
