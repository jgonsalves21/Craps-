
import java.util.Scanner;
public class CrapsTest {

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the craps game!");
		System.out.println("The rules go as follows:");
		System.out.println("If a 7 or an 11 is rolled  first, you win.");
		System.out.println("If a 2 or a 12 is rolled first, you lose.");
		System.out.println("If you roll anything else, that becomes your point");
		System.out.println("On subsequent rolls, a 7 will make you lose, while getting your point is a win.");
		System.out.println("Please press enter to roll:");
		in.nextLine();
		
		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		int sum = roll1+roll2;
		
		
		if  (sum == 7)
		{
			System.out.println("You rolled a " + sum + ", so you won!");
			System.out.println("Would you like to play again? If so, type Yes. If not, type No");
			String choice =  in.next();
			in.nextLine();
			
			while (choice == "Yes")
			{
				
			}
			if (choice == "No")
			{
				
			}
			while (choice != "No" || choice != "Yes")  
			{
				
			}
		}
		else if (sum == 11)	
		{
			System.out.println("You rolled a " + sum + ", so you won!");
			System.out.println("Would you like to play again? If so, type Yes. If not, type No");
			String choice =  in.next();
			in.nextLine();
			
			while (choice == "Yes")
			{
				System.out.println("Press enter to roll: ");
			}
			if (choice == "No")
			{
				
			}
			while (choice != "No" || choice != "Yes")  
			{
				
			}
		}
		else if (sum == 2)
		{
			System.out.println("You rolled a " + sum + ", so you lost.");
		}
		else if (sum == 12)
		{	
			System.out.println("You rolled a " + sum + ", so you lost.");
		}
		else if (sum > 2 || sum < 7 || sum > 7 || sum < 11)
		{
			System.out.println("You point is " + sum + ".");
		}
	}

}
