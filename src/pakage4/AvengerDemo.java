package pakage4;

public class AvengerDemo {

	public static void main(String[] args) {
		Avenger[] A = new Avenger[5];
		
		
		for (int i =0 ; i<A.length ; i++)
		{
			A[i]=new Avenger();
			System.out.println("Avenger number "+i);
			A[i].getDetails();
			System.out.println("\n");
		}
		
		for (int i =0 ; i<A.length ; i++)
		{
			A[i].displayDetails();
		}
	}

}
