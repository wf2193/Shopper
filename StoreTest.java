//*************************************
// Name: Wan Yu Fung (Alice)
// UNI: wf2193
//
// StoreTest (class)
//	
// Description: int keepRun allows the code to run until user plug in 0
//		String name1 =scanner of costumer
//		int money =scanner of costumer purchase
//
//**************************************
import java.util.Scanner;


public class StoreTest {
	
	public static void main(String[] args) 
	{

		Store ec = new Store();
		int keepRun = 1;
		while (keepRun == 1)
		{
			Scanner in = new Scanner (System.in);
			System.out.println ("Enter name of costumer: ");
			String name1 = in.next();
			System.out.println ("What is his/her purchase? ");
			double money = in.nextDouble();
			ec.addSale(name1, money);
			System.out.println ("Do you want to enter another costumer?"
					+ " 1 for yes. 0 for no.");
			keepRun = in.nextInt();
		}
		System.out.println(ec.nameOfBestCostumer() + " is best costumer.");
	}
}